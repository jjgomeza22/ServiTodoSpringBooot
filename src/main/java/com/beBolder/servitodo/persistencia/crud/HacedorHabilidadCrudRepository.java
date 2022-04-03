package com.beBolder.servitodo.persistencia.crud;
import com.beBolder.servitodo.domain.dto.HacedorHabilidadDto;
import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HacedorHabilidadCrudRepository extends CrudRepository<HacedorHabilidad, Integer> {
    List<HacedorHabilidad> findByHacedorHacedorID(int hacedorID);

    //@Query(value = "INSERT INTO hacedorhabilidad (hacedorID, habilidadID) VALUES (?, ?);", nativeQuery = true)
    //HacedorHabilidad saveHacedorHabilidad(int hacedorID, int habilidadID);
}
