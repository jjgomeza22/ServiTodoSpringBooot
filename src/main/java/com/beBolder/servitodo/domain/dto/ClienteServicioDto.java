package com.beBolder.servitodo.domain.dto;

public class ClienteServicioDto {

    private Integer clienteServicioID;
    private Integer clienteID;
    private Integer servicioID;
    //private Cliente cliente;
    //private Servicio servicio;

    public ClienteServicioDto() {
    }

    public Integer getClienteServicioID() {
        return clienteServicioID;
    }

    public void setClienteServicioID(Integer clienteServicioID) {
        this.clienteServicioID = clienteServicioID;
    }

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Integer getServicioID() {
        return servicioID;
    }

    public void setServicioID(Integer servicioID) {
        this.servicioID = servicioID;
    }
}
