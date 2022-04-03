package com.beBolder.servitodo.persistencia.crud;

import com.beBolder.servitodo.persistencia.entity.Hacedor;
import org.springframework.data.repository.CrudRepository;

public interface HacedorCrudRepository extends CrudRepository<Hacedor, Integer> {
    Hacedor findByHacedorID(int hacedorID);
    Hacedor findByEmail(String email);
}
