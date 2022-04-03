package com.beBolder.servitodo.persistencia;

import com.beBolder.servitodo.domain.dto.OfertaDto;
import com.beBolder.servitodo.domain.repository.OfertaDtoRepository;
import com.beBolder.servitodo.persistencia.crud.OfertaCrudRepository;
import com.beBolder.servitodo.persistencia.entity.Oferta;
import com.beBolder.servitodo.persistencia.mapper.OfertaDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OfertaRepository implements OfertaDtoRepository{

    @Autowired
    private OfertaCrudRepository ofertaCrudRepository;
    @Autowired
    private OfertaDtoMapper mapper;

    @Override
    public List<OfertaDto> getAll(){
        List<Oferta> ofertas = (List<Oferta>) ofertaCrudRepository.findAll();
        return mapper.toOfertaDtos(ofertas);
    }

    @Override
    public List<OfertaDto> getOfertasAceptadas() {
        return mapper.toOfertaDtos(ofertaCrudRepository.findByAceptadoIsNotNull());
    }

    @Override
    public OfertaDto getDetallesOferta(int ofertaID){
        return null;
    }
    @Override
    public List<OfertaDto> getOfertasParaHacedores() {
        return mapper.toOfertaDtos(ofertaCrudRepository.findByHacedorIDIsNullAndAceptadoIsNull());
    }

    @Override
    public OfertaDto aceptarOferta(int ofertaID, Oferta oferta) {
        Oferta ofer = ofertaCrudRepository.findByOfertaID(ofertaID);
        ofer.setAceptado(oferta.getAceptado());
        ofer.setHacedorID(oferta.getHacedorID());
        return mapper.toOfertaDto(ofertaCrudRepository.save(ofer));
    }

    @Override
    public OfertaDto registrarOferta(Oferta oferta) {
        return mapper.toOfertaDto(ofertaCrudRepository.save(oferta));
    }
    @Override
    public List<OfertaDto> serviciosParaHacedores(int servicioID){
        return mapper.toOfertaDtos(ofertaCrudRepository.findByServicioID(servicioID));
    }
}
