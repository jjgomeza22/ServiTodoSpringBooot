package com.beBolder.servitodo.domain.service;

import com.beBolder.servitodo.domain.dto.HacedorHabilidadDto;
import com.beBolder.servitodo.domain.repository.HacedorHabilidadDtoRepository;
import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HacedorHabilidadDtoService {
    @Autowired
    private HacedorHabilidadDtoRepository habilidadDtoRepository;

    public List<HacedorHabilidadDto> getAll(){
        return habilidadDtoRepository.getAll();
    }
    public List<HacedorHabilidadDto> getHabilidadesHacedor(int hacedorID){
        return habilidadDtoRepository.getHabilidadesHacedor(hacedorID);
    }
    public HacedorHabilidadDto registrarHabilidadHacedor(HacedorHabilidad hacedorHabilidad){
        return habilidadDtoRepository.registrarHabilidadHacedor(hacedorHabilidad);
    }
}
