package com.beBolder.servitodo.persistencia.crud;

import com.beBolder.servitodo.persistencia.entity.Servicio;
import org.springframework.data.repository.CrudRepository;

public interface ServicioCrudRepository extends CrudRepository<Servicio, Integer> {
}
