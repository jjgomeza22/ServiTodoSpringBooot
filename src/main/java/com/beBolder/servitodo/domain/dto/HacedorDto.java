package com.beBolder.servitodo.domain.dto;

import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;
import com.beBolder.servitodo.persistencia.entity.Oferta;
import java.util.List;

public class HacedorDto {

    private Integer hacedorID;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contrasena;
    private String email;
    private String numeroContacto;
    private String direccion;
    private Boolean disponibilidad;
    private String rangoTrabajo;

    private List<HacedorHabilidadDto> habilidades;

    public HacedorDto() {
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

    public List<HacedorHabilidadDto> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<HacedorHabilidadDto> habilidades) {
        this.habilidades = habilidades;
    }
}
