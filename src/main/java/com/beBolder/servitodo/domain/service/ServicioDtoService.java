package com.beBolder.servitodo.domain.service;

import com.beBolder.servitodo.domain.dto.ServicioDto;
import com.beBolder.servitodo.domain.repository.ServicioDtoRepository;
import com.beBolder.servitodo.persistencia.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDtoService {
    @Autowired
    private ServicioDtoRepository servicioDtoRepository;

    public List<ServicioDto> getAll(){
        return servicioDtoRepository.getAll();
    }

    public ServicioDto nuevoServicio(Servicio servicio){
        return servicioDtoRepository.nuevoServicio(servicio);
    }
}
