package com.beBolder.servitodo.persistencia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer servicioID;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "servicio")
    private List<Oferta> ofertas;

    @OneToMany(mappedBy = "servicio")
    private List<ClienteServicio> clientes;

    public Servicio() {
    }

    public Integer getServicioID() {
        return servicioID;
    }

    public void setServicioID(Integer servicioID) {
        this.servicioID = servicioID;
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

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    public List<ClienteServicio> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteServicio> clientes) {
        this.clientes = clientes;
    }
}
