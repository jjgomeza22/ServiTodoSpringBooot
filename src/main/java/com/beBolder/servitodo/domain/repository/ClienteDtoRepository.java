package com.beBolder.servitodo.domain.repository;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.persistencia.entity.Cliente;

import java.util.List;

public interface ClienteDtoRepository {
    List<ClienteDto> getAll();
    ClienteDto registrarCliente(Cliente cliente);
    ClienteDto getCliente(int clienteID);
    ClienteDto authCliente(String email);
}
