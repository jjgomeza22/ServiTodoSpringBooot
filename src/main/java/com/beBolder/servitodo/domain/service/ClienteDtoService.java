package com.beBolder.servitodo.domain.service;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.domain.repository.ClienteDtoRepository;
import com.beBolder.servitodo.persistencia.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteDtoService {
    @Autowired
    private ClienteDtoRepository clienteDtoRepository;

    public List<ClienteDto> getAll(){
        return clienteDtoRepository.getAll();
    }
    public ClienteDto registrarCliente(Cliente cliente){
        return clienteDtoRepository.registrarCliente(cliente);
    }

    public ClienteDto getCliente(int clienteID){
        return clienteDtoRepository.getCliente(clienteID);
    }

    public ClienteDto authCliente(String email){
        return clienteDtoRepository.authCliente(email);
    }
}
