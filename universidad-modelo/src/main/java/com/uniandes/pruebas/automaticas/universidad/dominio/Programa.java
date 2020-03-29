package com.uniandes.pruebas.automaticas.universidad.dominio;

import com.uniandes.pruebas.automaticas.universidad.dominio.enumerador.Departamento;

import java.util.List;

public class Programa {

    private String nombre;
    private Departamento departamento;
    private List<Curso> cursos;

    public Programa(String nombre, Departamento departamento, List<Curso> cursos) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
