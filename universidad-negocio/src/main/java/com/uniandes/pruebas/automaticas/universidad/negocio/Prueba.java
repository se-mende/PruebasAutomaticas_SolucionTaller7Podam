package com.uniandes.pruebas.automaticas.universidad.negocio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Curso;
import com.uniandes.pruebas.automaticas.universidad.dominio.Estudiante;
import com.uniandes.pruebas.automaticas.universidad.dominio.Programa;
import com.uniandes.pruebas.automaticas.universidad.dominio.enumerador.Departamento;
import com.uniandes.pruebas.automaticas.universidad.repositorio.CursoRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.EstudianteRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProfesorRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProgramaRepositorio;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

        EstudianteRepositorio estudianteRepositorio = new EstudianteRepositorio();
        ProgramaRepositorio programaRepositorio = new ProgramaRepositorio();
        ProfesorRepositorio profesorRepositorio = new ProfesorRepositorio();
        CursoRepositorio cursoRepositorio = new CursoRepositorio();

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("tati");
        estudiante.setCreditosInscritos(0);
        UniversidadNegocio universidadNegocio = new UniversidadNegocio(estudianteRepositorio, programaRepositorio, profesorRepositorio);
        universidadNegocio.inscribirEstudiante(estudiante);

        Curso curso = new Curso();
        curso.setNombre("prueba");
        curso.setEstudiantes(new ArrayList<>());
        curso.setCreditos(2);
        Programa programa = new Programa("polo", Departamento.INGENIERIA,new ArrayList<>());

        ProgramaNegocio programaNegocio = new ProgramaNegocio(cursoRepositorio, programaRepositorio);
        programaNegocio.crearPrograma(programa);
        programaNegocio.crearCurso(programa, curso);

        EstudianteNegocio estudianteNegocio = new EstudianteNegocio(estudianteRepositorio, cursoRepositorio);
        estudianteNegocio.inscribirCurso(estudiante, curso);
        estudianteNegocio.inscribirCurso(estudiante, curso);

    }
}
