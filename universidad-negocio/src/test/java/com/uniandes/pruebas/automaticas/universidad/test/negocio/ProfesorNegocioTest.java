package com.uniandes.pruebas.automaticas.universidad.test.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.uniandes.pruebas.automaticas.universidad.dominio.Profesor;
import com.uniandes.pruebas.automaticas.universidad.estrategias.EstrategiaGlobal;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProfesorRepositorio;

import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class ProfesorNegocioTest {
	private ProfesorRepositorio profesorRepositorio;
	private static PodamFactory factory;
	
	@BeforeAll
	private static void beforeAll() {
		DataProviderStrategy estrategia = new EstrategiaGlobal();
		factory = new PodamFactoryImpl(estrategia);
	}
	
	@BeforeEach
	private void beforeEach() {
		profesorRepositorio = new ProfesorRepositorio();
	}
	
	@Test
	public void crearProfesorConEspecialidadGlobal() {
		Profesor profesor = factory.manufacturePojo(Profesor.class);
		profesorRepositorio.crear(profesor);
		
		Assertions.assertTrue(profesorRepositorio.getProfesores().get(0).getEspecialidad() == "String global");
		Assertions.assertTrue(profesorRepositorio.getProfesores().get(0).getNombre() == "String global");
	}
 }

