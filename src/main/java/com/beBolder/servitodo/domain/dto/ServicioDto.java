package com.beBolder.servitodo.domain.dto;

import com.beBolder.servitodo.persistencia.entity.ClienteServicio;
import com.beBolder.servitodo.persistencia.entity.Oferta;

import java.util.List;

public class ServicioDto {

    private Integer servicioID;
    private String nombre;
    private String descripcion;
    //private List<Oferta> ofertas;
    //private List<ClienteServicio> clientes;

    public ServicioDto() {
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

    /*public List<Oferta> getOfertas() {
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
    }*/
}
