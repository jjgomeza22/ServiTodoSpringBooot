package com.beBolder.servitodo.persistencia;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.domain.repository.ClienteDtoRepository;
import com.beBolder.servitodo.persistencia.crud.ClienteCrudRepository;
import com.beBolder.servitodo.persistencia.entity.Cliente;
import com.beBolder.servitodo.persistencia.mapper.ClienteDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository implements ClienteDtoRepository {
    @Autowired
    private ClienteCrudRepository clienteCrudRepository;
    @Autowired
    private ClienteDtoMapper mapper;

    @Override
    public List<ClienteDto> getAll(){
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toClienteDtos(clientes);
    }
    @Override
    public ClienteDto registrarCliente(Cliente cliente){
        return mapper.toClienteDto(clienteCrudRepository.save(cliente));
    }

    @Override
    public ClienteDto getCliente(int clienteID){
        return mapper.toClienteDto(clienteCrudRepository.findByClienteID(clienteID));
    }

    @Override
    public ClienteDto authCliente(String email) {
        Cliente cliente = clienteCrudRepository.findByEmail(email);
        if (cliente.equals(null)){
            cliente = null;
        }
        return mapper.toClienteDto(cliente);
    }
}
