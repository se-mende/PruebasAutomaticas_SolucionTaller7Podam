package com.uniandes.pruebas.automaticas.universidad.test.negocio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Curso;
import com.uniandes.pruebas.automaticas.universidad.dominio.Estudiante;
import com.uniandes.pruebas.automaticas.universidad.dominio.Programa; 
import com.uniandes.pruebas.automaticas.universidad.dominio.enumerador.Departamento; 
import com.uniandes.pruebas.automaticas.universidad.negocio.ProgramaNegocio; 
import com.uniandes.pruebas.automaticas.universidad.repositorio.CursoRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.EstudianteRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProgramaRepositorio;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions; 
import org.junit.jupiter.api.BeforeAll; 
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test; 
import uk.co.jemos.podam.api.PodamFactory; 
import uk.co.jemos.podam.api.PodamFactoryImpl; 

public class ProgramaNegocioTest {
	private CursoRepositorio cursoRepositorio;
	private ProgramaRepositorio programaRepositorio;
	private ProgramaNegocio programaNegocio;
	private static PodamFactory factory;
	
	@BeforeAll
	private static void beforeAll() {
		factory = new PodamFactoryImpl();
	}
	
	@BeforeEach
	private void beforeEach() {
		cursoRepositorio = new CursoRepositorio();
		programaRepositorio = new ProgramaRepositorio();
		programaNegocio = new ProgramaNegocio(cursoRepositorio, programaRepositorio);
	}
	
	@Test
	public void agregarCursoConEstrategiaCreditos() {
		Programa programa = new Programa("Psicología", Departamento.HUMANIDADES, new ArrayList<>());
		programaRepositorio.crear(programa);
		
		Curso curso = factory.manufacturePojo(Curso.class);
		
		programaNegocio.crearCurso(programa, curso);
		
		Assertions.assertFalse(programaRepositorio.getProgramas().get(0).getCursos().isEmpty());
		Assertions.assertTrue(programaRepositorio.getProgramas().get(0).getCursos().get(0).getCreditos() <= 4);
		Assertions.assertTrue(programaRepositorio.getProgramas().get(0).getCursos().get(0).getCreditos() > 0);
	}
	
	
	@Test
	public void agregarCursoProgramaExistente() {
		Programa programa = new Programa("Ingeniería de Software", Departamento.INGENIERIA, new ArrayList<>());
		programaRepositorio.crear(programa);
		
		Curso curso = factory.manufacturePojo(Curso.class);
		
		programaNegocio.crearCurso( programa, curso);
		
		Assertions.assertFalse(programaRepositorio.getProgramas().get(0).getCursos().isEmpty());
	}
	
	@Test
	public void agregarCursoProgramaNoExiste() {
		Assertions.assertThrows(ProgramaNegocio.ErrorProgramaNoExiste.class, this::crearCurso);
	}
	
	private void crearCurso() {
		Programa programa = new Programa("Física", Departamento.CIENCIAS, new ArrayList<>());
		Curso curso = factory.manufacturePojo(Curso.class);
		
		programaNegocio.crearCurso(programa, curso);
	}
}
