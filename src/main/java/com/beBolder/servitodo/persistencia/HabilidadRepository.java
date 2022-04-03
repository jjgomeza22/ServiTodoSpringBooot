package com.beBolder.servitodo.persistencia;

import com.beBolder.servitodo.domain.dto.HabilidadDto;
import com.beBolder.servitodo.domain.repository.HabilidadDtoRepository;
import com.beBolder.servitodo.persistencia.crud.HabilidadCrudRepository;
import com.beBolder.servitodo.persistencia.entity.Habilidad;
import com.beBolder.servitodo.persistencia.mapper.HabilidadDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HabilidadRepository implements HabilidadDtoRepository {
    @Autowired
    private HabilidadCrudRepository habilidadCrudRepository;
    @Autowired
    private HabilidadDtoMapper mapper;

    @Override
    public List<HabilidadDto> getAll(){
        List<Habilidad> habilidades = (List<Habilidad>) habilidadCrudRepository.findAll();
        return mapper.toHabilidadDtos(habilidades);
    }
}
