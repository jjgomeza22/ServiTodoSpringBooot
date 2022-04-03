package com.beBolder.servitodo.persistencia.entity;

import javax.persistence.*;

@Entity
@Table(name = "clienteservicio")
public class ClienteServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteServicioID")
    private Integer clienteServicioID;

    private Integer clienteID;
    private Integer servicioID;

    @ManyToOne
    @JoinColumn(name = "clienteID", insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "servicioID", insertable = false, updatable = false)
    private Servicio servicio;

    public ClienteServicio() {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
