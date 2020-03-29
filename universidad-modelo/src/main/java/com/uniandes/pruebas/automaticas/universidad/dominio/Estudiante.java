package com.uniandes.pruebas.automaticas.universidad.dominio;

import com.uniandes.pruebas.automaticas.universidad.estrategias.EdadEstrategia;

import uk.co.jemos.podam.annotations.PodamStrategyValue;

public class Estudiante {

    private String nombre;
    @PodamStrategyValue(EdadEstrategia.class)
    private Integer edad;
    private Genero genero;
    private Integer codigo;
    private Integer creditosInscritos;

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getCreditosInscritos() {
        return creditosInscritos;
    }

    public void agregarCreditos(Integer creditos){
        creditosInscritos += creditos;
    }

    public void eliminarCreditos(Integer creditos){
        creditosInscritos -= creditos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCreditosInscritos(Integer creditosInscritos) {
        this.creditosInscritos = creditosInscritos;
    }
}
