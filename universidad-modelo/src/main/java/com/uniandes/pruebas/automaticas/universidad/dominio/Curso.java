package com.uniandes.pruebas.automaticas.universidad.dominio;

import java.util.List;

import com.uniandes.pruebas.automaticas.universidad.estrategias.CreditoEstrategia;

import uk.co.jemos.podam.annotations.PodamStrategyValue;

public class Curso {

    private String nombre;
    
    @PodamStrategyValue(CreditoEstrategia.class)
    private Integer creditos;
    
    private String codigo;
    private List<Estudiante> estudiantes;

    public String getNombre() {
        return nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
