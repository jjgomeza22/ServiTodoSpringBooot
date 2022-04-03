package com.beBolder.servitodo.persistencia.crud;

import com.beBolder.servitodo.domain.dto.OfertaDto;
import com.beBolder.servitodo.persistencia.entity.Oferta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OfertaCrudRepository extends CrudRepository<Oferta, Integer> {
    List<Oferta> findByAceptadoIsNotNull();
    Oferta findByOfertaID(int ofertaID);
    List<Oferta> findByHacedorIDIsNullAndAceptadoIsNull();
    List<Oferta> findByServicioID(int servicioID);
}
