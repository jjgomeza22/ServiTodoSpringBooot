package com.beBolder.servitodo.persistencia;

import com.beBolder.servitodo.domain.dto.HacedorHabilidadDto;
import com.beBolder.servitodo.domain.repository.HacedorHabilidadDtoRepository;
import com.beBolder.servitodo.persistencia.crud.HacedorHabilidadCrudRepository;
import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;
import com.beBolder.servitodo.persistencia.mapper.HacedorHabilidadDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HacedorHabilidadRepository implements HacedorHabilidadDtoRepository {
    @Autowired
    private HacedorHabilidadCrudRepository hacedorHabilidadCrudRepository;
    @Autowired
    private HacedorHabilidadDtoMapper mapper;

    @Override
    public List<HacedorHabilidadDto> getAll(){
        List<HacedorHabilidad> hacedorHabilidades = (List<HacedorHabilidad>) hacedorHabilidadCrudRepository.findAll();
        return mapper.toHacedorHabilidadDtos(hacedorHabilidades);
    }

    @Override
    public List<HacedorHabilidadDto> getHabilidadesHacedor(int hacedorID) {
        List<HacedorHabilidad> hacedorHabilidades = (List<HacedorHabilidad>) hacedorHabilidadCrudRepository.findByHacedorHacedorID(hacedorID);
        return mapper.toHacedorHabilidadDtos(hacedorHabilidades);
    }

    @Override
    public HacedorHabilidadDto registrarHabilidadHacedor(HacedorHabilidad hacedorHabilidad){
        return mapper.toHacedorHabilidadDto(hacedorHabilidadCrudRepository.save(hacedorHabilidad));
    }
}
