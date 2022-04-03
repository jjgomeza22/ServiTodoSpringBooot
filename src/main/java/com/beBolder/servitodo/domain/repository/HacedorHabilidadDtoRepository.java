package com.beBolder.servitodo.domain.repository;

import com.beBolder.servitodo.domain.dto.HacedorHabilidadDto;
import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;

import java.util.List;

public interface HacedorHabilidadDtoRepository {
    List<HacedorHabilidadDto> getAll();
    List<HacedorHabilidadDto> getHabilidadesHacedor(int hacedorID);
    HacedorHabilidadDto registrarHabilidadHacedor(HacedorHabilidad hacedorHabilidad);
}
