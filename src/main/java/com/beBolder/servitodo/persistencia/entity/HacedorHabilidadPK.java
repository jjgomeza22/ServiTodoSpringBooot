package com.beBolder.servitodo.persistencia.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HacedorHabilidadPK implements Serializable {

    private Integer hacedorID;
    private Integer habilidadID;

    public HacedorHabilidadPK() {
    }

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
}
