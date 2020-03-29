package com.uniandes.pruebas.automaticas.universidad.negocio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Curso;
import com.uniandes.pruebas.automaticas.universidad.dominio.Estudiante;
import com.uniandes.pruebas.automaticas.universidad.repositorio.CursoRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.EstudianteRepositorio;

public class EstudianteNegocio {

    private EstudianteRepositorio estudianteRepositorio;
    private CursoRepositorio cursoRepositorio;

    public EstudianteNegocio(EstudianteRepositorio estudianteRepositorio, CursoRepositorio cursoRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
        this.cursoRepositorio = cursoRepositorio;
    }

    public void inscribirCurso(Estudiante estudiante, Curso curso){
        try {
            estudiante.agregarCreditos(curso.getCreditos());
            curso.getEstudiantes().add(estudiante);
            estudianteRepositorio.modificar(estudiante);
            cursoRepositorio.modificar(curso);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new ErrorCursoNoExiste(e);
        }

    }

    public void retirarCurso(Estudiante estudiante, Curso curso){
        try{
            estudiante.eliminarCreditos(curso.getCreditos());
            curso.getEstudiantes().remove(estudiante);
            estudianteRepositorio.modificar(estudiante);
            cursoRepositorio.modificar(curso);
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new ErrorCursoNoExiste(e);
        }
    }

    public static class ErrorCursoNoExiste extends RuntimeException {
        public ErrorCursoNoExiste(Throwable e) {
            super("El curso no existe", e);
        }
    }
}
