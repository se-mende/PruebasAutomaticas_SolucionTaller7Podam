package com.uniandes.pruebas.automaticas.universidad.test.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.uniandes.pruebas.automaticas.universidad.dominio.Estudiante;
import com.uniandes.pruebas.automaticas.universidad.estrategias.EstrategiaGlobal;
import com.uniandes.pruebas.automaticas.universidad.negocio.UniversidadNegocio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.EstudianteRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProfesorRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProgramaRepositorio;

import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class UniversidadNegocioTest {
	private EstudianteRepositorio estudianteRepositorio;
	private ProfesorRepositorio profesorRepositorio;
	private ProgramaRepositorio programaRepositorio;
	private UniversidadNegocio universidadNegocio;
	private static PodamFactory factory;
	
	@BeforeAll
	private static void beforeAll() {
		DataProviderStrategy estrategia = new EstrategiaGlobal();
		factory = new PodamFactoryImpl(estrategia);
	}
	
	@BeforeEach
	private void beforeEach() {
		estudianteRepositorio = new EstudianteRepositorio();
		programaRepositorio = new ProgramaRepositorio();
		profesorRepositorio = new ProfesorRepositorio();
		universidadNegocio = new UniversidadNegocio(estudianteRepositorio, programaRepositorio, profesorRepositorio);
	}
	
	@Test
	public void inscribirEstudianteEstrategiaEnterosGlobales() {
		Estudiante estudiante = factory.manufacturePojo(Estudiante.class);
		
		universidadNegocio.inscribirEstudiante(estudiante);
		
		Assertions.assertTrue(estudianteRepositorio.getEstudiantes().get(0).getCodigo() > 0);
		Assertions.assertTrue(estudianteRepositorio.getEstudiantes().get(0).getCreditosInscritos() > 0);
		Assertions.assertTrue(estudianteRepositorio.getEstudiantes().get(0).getEdad() > 0);
	}
}
