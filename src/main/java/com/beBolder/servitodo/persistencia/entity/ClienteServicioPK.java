package com.beBolder.servitodo.persistencia.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ClienteServicioPK implements Serializable {

    private Integer clienteID;
    private Integer servicioID;

    public ClienteServicioPK() {
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
