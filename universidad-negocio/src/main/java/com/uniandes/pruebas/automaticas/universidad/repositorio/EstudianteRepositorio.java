package com.uniandes.pruebas.automaticas.universidad.repositorio;

import com.uniandes.pruebas.automaticas.universidad.dominio.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudianteRepositorio {

    public List<Estudiante> estudiantes;

    public EstudianteRepositorio() {
        this.estudiantes = new ArrayList<>();
    }

    public void crear(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void modificar(Estudiante estudiante){
        estudiantes.set(estudiantes.indexOf(estudiante), estudiante);
    }

    public void crear(List<Estudiante> estudiantes){
        estudiantes.addAll(estudiantes);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
