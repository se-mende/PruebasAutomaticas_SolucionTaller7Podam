package com.uniandes.pruebas.automaticas.universidad.test.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.uniandes.pruebas.automaticas.universidad.dominio.Curso;
import com.uniandes.pruebas.automaticas.universidad.dominio.Estudiante;
import com.uniandes.pruebas.automaticas.universidad.negocio.EstudianteNegocio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.CursoRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.EstudianteRepositorio;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class CursoNegocioTest {
	private CursoRepositorio cursoRepositorio;
	private EstudianteRepositorio estudianteRepositorio;
	private EstudianteNegocio estudianteNegocio;
	private static PodamFactory factory;
	
	@BeforeAll
	private static void beforeAll() {
		factory = new PodamFactoryImpl();
	}
	
	@BeforeEach
	private void beforeEach() {
		cursoRepositorio = new CursoRepositorio();
		estudianteRepositorio = new EstudianteRepositorio();
		estudianteNegocio = new EstudianteNegocio(estudianteRepositorio, cursoRepositorio);
	}
	
	@Test
	public void agregarEstudianteEdadValida() {
		Curso curso = factory.manufacturePojo(Curso.class);
		cursoRepositorio.crear(curso);
		
		Estudiante estudiante = factory.manufacturePojo(Estudiante.class);
		estudianteRepositorio.crear(estudiante);
		
		estudianteNegocio.inscribirCurso(estudiante, curso);
		
		Assertions.assertFalse(cursoRepositorio.getCursos().get(0).getEstudiantes().isEmpty());
		Assertions.assertTrue(cursoRepositorio.getCursos().get(0).getEstudiantes().get(0).getEdad() >= 10);
		Assertions.assertTrue(cursoRepositorio.getCursos().get(0).getEstudiantes().get(0).getEdad() < 100);
	}
	
	@Test
	public void agregarEstudianteProgramaExistente() {
		Curso curso = factory.manufacturePojo(Curso.class);
		cursoRepositorio.crear(curso);
		
		Estudiante estudiante = factory.manufacturePojo(Estudiante.class);
		estudianteRepositorio.crear(estudiante);
		
		estudianteNegocio.inscribirCurso(estudiante, curso);
		
		Assertions.assertFalse(cursoRepositorio.getCursos().get(0).getEstudiantes().isEmpty());
	}
	
	@Test
	public void agregarEstudianteCursoNoExiste() {
		Assertions.assertThrows(EstudianteNegocio.ErrorCursoNoExiste.class, this::crearEstudiante);
	}
	
	private void crearEstudiante() {
		Curso curso = factory.manufacturePojo(Curso.class);
		
		Estudiante estudiante = factory.manufacturePojo(Estudiante.class);
		estudianteRepositorio.crear(estudiante);
		
		estudianteNegocio.inscribirCurso(estudiante, curso);
	}
	
}
