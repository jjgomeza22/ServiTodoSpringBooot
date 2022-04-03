package com.beBolder.servitodo.persistencia.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "oferta")
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oferta_id")
    private Integer ofertaID;
    
    @Column(name = "cliente_id")
    private Integer clienteID;
    @Column(name = "hacedor_id")
    private Integer hacedorID;
    @Column(name = "servicio_id")
    private Integer servicioID;
    private String direccion;
    private Boolean aceptado;
    private Boolean habilitado;
    private LocalDateTime fecha;
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "clienteID", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "hacedorID", insertable = false, updatable = false)
    private Hacedor hacedor;

    @ManyToOne
    @JoinColumn(name = "servicioID", insertable = false, updatable = false)
    private Servicio servicio;

    public Oferta() {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hacedor getHacedor() {
        return hacedor;
    }

    public void setHacedor(Hacedor hacedor) {
        this.hacedor = hacedor;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
