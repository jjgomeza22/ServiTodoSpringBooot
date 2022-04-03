package com.beBolder.servitodo.persistencia.entity;

import javax.persistence.*;

@Entity
@Table(name = "hacedorhabilidad")
public class HacedorHabilidad {

    @Id
    @Column(name = "hacedorHabilidadID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hacedorHabilidadID;

    private Integer hacedorID;
    private Integer habilidadID;

    @ManyToOne
    @JoinColumn(name = "hacedorID", insertable = false, updatable = false)
    private Hacedor hacedor;

    @ManyToOne
    @JoinColumn(name = "habilidadID", insertable = false, updatable = false)
    private Habilidad habilidad;

    public HacedorHabilidad() {
    }

    public Integer getHacedorHabilidadID() {
        return hacedorHabilidadID;
    }

    public void setHacedorHabilidadID(Integer hacedorHabilidadID) {
        this.hacedorHabilidadID = hacedorHabilidadID;
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

    public Hacedor getHacedor() {
        return hacedor;
    }

    public void setHacedor(Hacedor hacedor) {
        this.hacedor = hacedor;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }
}
