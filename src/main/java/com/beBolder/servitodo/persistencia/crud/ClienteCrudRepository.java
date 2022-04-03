package com.beBolder.servitodo.persistencia.crud;

import com.beBolder.servitodo.persistencia.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
    Cliente findByClienteID(int ClienteID);
    Cliente findByEmail(String email);
}
