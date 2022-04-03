package com.beBolder.servitodo.domain.service;

import com.beBolder.servitodo.domain.dto.HabilidadDto;
import com.beBolder.servitodo.domain.repository.HabilidadDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadDtoService {
    @Autowired
    private HabilidadDtoRepository habilidadDtoRepository;

    public List<HabilidadDto> getAll(){
        return habilidadDtoRepository.getAll();
    }
}
