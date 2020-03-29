package com.uniandes.pruebas.automaticas.universidad.negocio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Curso;
import com.uniandes.pruebas.automaticas.universidad.dominio.Programa;
import com.uniandes.pruebas.automaticas.universidad.repositorio.CursoRepositorio;
import com.uniandes.pruebas.automaticas.universidad.repositorio.ProgramaRepositorio;

import java.util.List;

public class ProgramaNegocio {

    private CursoRepositorio repositorio;
    private ProgramaRepositorio programaRepositorio;

    public ProgramaNegocio(CursoRepositorio repositorio, ProgramaRepositorio programaRepositorio) {
        this.repositorio = repositorio;
        this.programaRepositorio = programaRepositorio;
    }

    public void crearPrograma(Programa programa){
        programaRepositorio.crear(programa);
    }

    public void crearCurso(Programa programa, Curso curso) throws ErrorProgramaNoExiste{
        if(programaRepositorio.existePrograma(programa)){
            repositorio.crear(curso);
            programa.getCursos().add(curso);
            programaRepositorio.modificar(programa);
        }else {
            throw new ErrorProgramaNoExiste();
        }
    }

    public List<Programa> obtenerProgramas(){
        return programaRepositorio.getProgramas();
    }

    public static class ErrorProgramaNoExiste extends RuntimeException {
        public ErrorProgramaNoExiste() {
            super("El programa no existe");
        }
    }
}
