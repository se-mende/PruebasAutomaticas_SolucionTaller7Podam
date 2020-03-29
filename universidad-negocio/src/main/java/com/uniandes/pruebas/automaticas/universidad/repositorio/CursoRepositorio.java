package com.uniandes.pruebas.automaticas.universidad.repositorio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoRepositorio {

    private List<Curso> cursos;
    private EstudianteRepositorio repositorio;

    public CursoRepositorio() {
        this.cursos = new ArrayList<>();
        this.repositorio = new EstudianteRepositorio();
    }

    public CursoRepositorio(List<Curso> cursos, EstudianteRepositorio repositorio) {
        this.cursos = cursos;
        this.repositorio = repositorio;
    }

    public void crear(Curso curso){
        cursos.add(curso);
    }

    public void modificar(Curso curso){
        cursos.set(cursos.indexOf(curso), curso);
    }

    public void eliminar(Curso curso){
        cursos.remove(curso);
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }
}
