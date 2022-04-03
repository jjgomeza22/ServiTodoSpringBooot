package com.beBolder.servitodo.domain.dto;

import com.beBolder.servitodo.persistencia.entity.Cliente;
import com.beBolder.servitodo.persistencia.entity.Hacedor;
import com.beBolder.servitodo.persistencia.entity.Servicio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OfertaDto {

    private Integer ofertaID;
    private Integer clienteID;
    private Integer hacedorID;
    private Integer servicioID;
    private String direccion;
    private Boolean aceptado;
    private Boolean habilitado;
    private LocalDateTime fecha;
    private BigDecimal precio;

    public OfertaDto() {
    }

    public Integer getOfertaID() {
        return ofertaID;
    }

    public void setOfertaID(Integer ofertaID) {
        this.ofertaID = ofertaID;
    }

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Integer getHacedorID() {
        return hacedorID;
    }

    public void setHacedorID(Integer hacedorID) {
        this.hacedorID = hacedorID;
    }

    public Integer getServicioID() {
        return servicioID;
    }

    public void setServicioID(Integer servicioID) {
        this.servicioID = servicioID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
