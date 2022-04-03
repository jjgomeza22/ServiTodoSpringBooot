package com.beBolder.servitodo.domain.dto;

import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;

import java.util.List;

public class HabilidadDto {
    private Integer habilidadID;
    private String nombre;
    private String descripcion;
    //private List<HacedorHabilidad> hacedores;

    public HabilidadDto() {
    }

    public Integer getHabilidadID() {
        return habilidadID;
    }

    public void setHabilidadID(Integer habilidadID) {
        this.habilidadID = habilidadID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*public List<HacedorHabilidad> getHacedores() {
        return hacedores;
    }

    public void setHacedores(List<HacedorHabilidad> hacedores) {
        this.hacedores = hacedores;
    }*/
}
