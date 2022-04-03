package com.beBolder.servitodo.domain.dto;

import com.beBolder.servitodo.persistencia.entity.Habilidad;
import com.beBolder.servitodo.persistencia.entity.Hacedor;

public class HacedorHabilidadDto {
    //private Integer hacedorHabilidadID;
    private Integer hacedorID;
    private Integer habilidadID;
    //private Hacedor hacedor;
    //private HabilidadDto habilidad;

    public HacedorHabilidadDto() {
    }

    /*public Integer getHacedorHabilidadID() {
        return hacedorHabilidadID;
    }

    public void setHacedorHabilidadID(Integer hacedorHabilidadID) {
        this.hacedorHabilidadID = hacedorHabilidadID;
    }*/

    public Integer getHacedorID() {
        return hacedorID;
    }

    public void setHacedorID(Integer hacedorID) {
        this.hacedorID = hacedorID;
    }

    public Integer getHabilidadID() {
        return habilidadID;
    }

    public void setHabilidadID(Integer habilidadID) {
        this.habilidadID = habilidadID;
    }

    /*public HabilidadDto getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(HabilidadDto habilidad) {
        this.habilidad = habilidad;
    }*/
}
