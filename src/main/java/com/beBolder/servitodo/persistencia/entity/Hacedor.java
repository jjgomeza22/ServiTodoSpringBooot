package com.beBolder.servitodo.persistencia.entity;

import jdk.dynalink.linker.LinkerServices;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hacedor")
public class Hacedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hacedor_id")
    private Integer hacedorID;

    private String nombre;
    private String apellido;
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    private String contrasena;
    private String email;
    @Column(name = "numero_contacto")
    private String numeroContacto;
    private String direccion;
    private Boolean disponibilidad;
    @Column(name = "rango_trabajo")
    private String rangoTrabajo;

    @OneToMany(mappedBy = "hacedor")
    private List<HacedorHabilidad> habilidades;

    @OneToOne(mappedBy = "hacedor")
    private Oferta oferta;

    public Hacedor() {
    }

    public Integer getHacedorID() {
        return hacedorID;
    }

    public void setHacedorID(Integer hacedorID) {
        this.hacedorID = hacedorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getRangoTrabajo() {
        return rangoTrabajo;
    }

    public void setRangoTrabajo(String rangoTrabajo) {
        this.rangoTrabajo = rangoTrabajo;
    }

    public List<HacedorHabilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<HacedorHabilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
}
