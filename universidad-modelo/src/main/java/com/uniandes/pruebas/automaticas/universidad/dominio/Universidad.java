package com.uniandes.pruebas.automaticas.universidad.dominio;

import java.util.List;

public class Universidad {

    private String nombre;
    private String nit;
    private List<Programa> programas;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public List<Programa> getProgramas() {
        return programas;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setProgramas(List<Programa> programas) {
        this.programas = programas;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
