package com.uniandes.pruebas.automaticas.universidad.repositorio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Programa;

import java.util.ArrayList;
import java.util.List;

public class ProgramaRepositorio {

    private List<Programa> programas;

    public ProgramaRepositorio() {
        this.programas = new ArrayList<>();
    }

    public void crear(Programa programa){
        programas.add(programa);
    }

    public void modificar(Programa programa){
        programas.set(programas.indexOf(programa), programa);
    }

    public boolean existePrograma(Programa programa){
        return !programas.isEmpty() && programas.contains(programa);
    }

    public List<Programa> getProgramas() {
        return programas;
    }
}
