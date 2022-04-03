package com.beBolder.servitodo.domain.repository;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.domain.dto.HacedorDto;
import com.beBolder.servitodo.persistencia.entity.Hacedor;

import java.util.List;

public interface HacedorDtoRepository {
    List<HacedorDto> getAll();
    HacedorDto getDetallesHacedor(int hacedorID);
    HacedorDto registrarHacedor(Hacedor hacedor);
    HacedorDto registrarDetallesHacedor(int hacedorID, Hacedor hacedor);
    HacedorDto authHacedor(String email);
}
