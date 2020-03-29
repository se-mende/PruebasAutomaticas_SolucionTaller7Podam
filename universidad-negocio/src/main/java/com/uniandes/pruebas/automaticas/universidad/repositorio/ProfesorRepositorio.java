package com.uniandes.pruebas.automaticas.universidad.repositorio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Profesor;

import java.util.ArrayList;
import java.util.List;

public class ProfesorRepositorio {

    public List<Profesor> profesores;

    public ProfesorRepositorio() {
        this.profesores = new ArrayList<Profesor>();
    }

    public void crear(Profesor profesor){
        profesores.add(profesor);
    }

    public List<Profesor> getProfesores(){
        return this.profesores;
    }
}
