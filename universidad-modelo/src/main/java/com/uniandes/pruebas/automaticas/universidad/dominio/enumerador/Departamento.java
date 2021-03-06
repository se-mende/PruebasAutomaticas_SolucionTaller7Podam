package com.uniandes.pruebas.automaticas.universidad.dominio.enumerador;

public enum Departamento {

    CIENCIAS(1, "C","Departamento de Ciencias"),
    INGENIERIA(2, "I","Ingeniería"),
    HUMANIDADES(3,"H","Humanidades")
    ;

    private Integer id;
    private String codigo;
    private String descripcion;

    Departamento(Integer id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
