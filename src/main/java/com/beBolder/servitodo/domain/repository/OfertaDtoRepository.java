package com.beBolder.servitodo.domain.repository;

import com.beBolder.servitodo.domain.dto.OfertaDto;
import com.beBolder.servitodo.persistencia.entity.Oferta;

import java.util.List;

public interface OfertaDtoRepository {
    List<OfertaDto> getAll();
    List<OfertaDto> getOfertasAceptadas();
    OfertaDto getDetallesOferta(int ofertaID);
    List<OfertaDto> getOfertasParaHacedores();
    OfertaDto aceptarOferta(int ofertaID, Oferta oferta);
    OfertaDto registrarOferta(Oferta oferta);
    List<OfertaDto> serviciosParaHacedores(int servicioId);
}
