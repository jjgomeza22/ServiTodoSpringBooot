package com.beBolder.servitodo.domain.repository;

import com.beBolder.servitodo.domain.dto.ServicioDto;
import com.beBolder.servitodo.persistencia.entity.Servicio;

import java.util.List;

public interface ServicioDtoRepository {
    List<ServicioDto> getAll();
    ServicioDto nuevoServicio(Servicio servicio);
}
