package com.beBolder.servitodo.domain.service;

import com.beBolder.servitodo.domain.dto.OfertaDto;
import com.beBolder.servitodo.domain.repository.OfertaDtoRepository;
import com.beBolder.servitodo.persistencia.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfertaDtoService {
    @Autowired
    private OfertaDtoRepository ofertaDtoRepository;

    public List<OfertaDto> getAll(){
        return ofertaDtoRepository.getAll();
    }
    public OfertaDto getDetallesOferta(int ofertaID){
        return ofertaDtoRepository.getDetallesOferta(ofertaID);
    }

    public List<OfertaDto> getOfertasParaHacedores(){
        return ofertaDtoRepository.getOfertasParaHacedores();
    }

    public OfertaDto aceptarOferta(int ofertaID, Oferta oferta){
        return ofertaDtoRepository.aceptarOferta(ofertaID, oferta);
    }

    public OfertaDto registrarOferta(Oferta oferta){
        return ofertaDtoRepository.registrarOferta(oferta);
    }

    public List<OfertaDto> serviciosParaHacedores(int servicioID){
        return ofertaDtoRepository.serviciosParaHacedores(servicioID);
    }

    public List<OfertaDto> getOfertasAceptadas(){
        return ofertaDtoRepository.getOfertasAceptadas();
    }
}
