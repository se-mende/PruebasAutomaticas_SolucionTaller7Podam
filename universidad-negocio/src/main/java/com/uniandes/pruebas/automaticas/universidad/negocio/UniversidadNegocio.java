package com.uniandes.pruebas.automaticas.universidad.negocio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Estudiante;
import com.uniandes.pruebas.automaticas.universidad.dominio.Profesor;
import com.uniandes.pruebas.automaticas.universidad.dominio.Programa;
import com.uniandes.pruebas.automaticas.universidad.repositorio.EstudianteRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProfesorRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProgramaRepositorio;

import java.util.List;

public class UniversidadNegocio {

    private EstudianteRepositorio estudianteRepositorio;
    private ProgramaRepositorio programaRepositorio;
    private ProfesorRepositorio profesorRepositorio;

    public UniversidadNegocio(EstudianteRepositorio estudianteRepositorio, ProgramaRepositorio programaRepositorio, ProfesorRepositorio profesorRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
        this.programaRepositorio = programaRepositorio;
        this.profesorRepositorio = profesorRepositorio;
    }

    public void inscribirEstudiante(Estudiante estudiante){
        estudianteRepositorio.crear(estudiante);
    }

    public void inscribirVariosEstudiantes(List<Estudiante> estudiantes){
        estudianteRepositorio.crear(estudiantes);
    }

    public void agregarPrograma(Programa programa){
        programaRepositorio.crear(programa);
    }

    public void contratarProfesor(Profesor profesor){
        profesorRepositorio.crear(profesor);
    }

    public List<Profesor> obtenerProfesores(){
        return profesorRepositorio.getProfesores();
    }

    public List<Programa> obtenerProgramas(){
        return programaRepositorio.getProgramas();
    }

    public List<Estudiante> obtenerEstudiantes(){
        return estudianteRepositorio.getEstudiantes();
    }
}
