package com.beBolder.servitodo.domain.service;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.domain.dto.HacedorDto;
import com.beBolder.servitodo.domain.repository.HacedorDtoRepository;
import com.beBolder.servitodo.persistencia.entity.Hacedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HacedorDtoService {
    @Autowired
    private HacedorDtoRepository hacedorDtoRepository;

    public List<HacedorDto> getAll(){
        return hacedorDtoRepository.getAll();
    }
    public HacedorDto getDetallesHacedor(int hacedorID){
        return hacedorDtoRepository.getDetallesHacedor(hacedorID);
    }
    public HacedorDto registrarHacedor(Hacedor hacedor){
        return hacedorDtoRepository.registrarHacedor(hacedor);
    }
    public HacedorDto registrarDetallesHacedor(int hacedorID, Hacedor hacedor){
        return hacedorDtoRepository.registrarDetallesHacedor(hacedorID, hacedor);
    }

    public HacedorDto authHacedor(String email){
        return hacedorDtoRepository.authHacedor(email);
    }
}
