package com.beBolder.servitodo.persistencia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "habilidad")
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer habilidadID;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "habilidad")
    private List<HacedorHabilidad> hacedores;

    public Habilidad() {
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

    public List<HacedorHabilidad> getHacedores() {
        return hacedores;
    }

    public void setHacedores(List<HacedorHabilidad> hacedores) {
        this.hacedores = hacedores;
    }
}
