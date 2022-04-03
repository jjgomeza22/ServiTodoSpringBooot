package com.beBolder.servitodo.persistencia;

import com.beBolder.servitodo.domain.dto.ServicioDto;
import com.beBolder.servitodo.domain.repository.ServicioDtoRepository;
import com.beBolder.servitodo.persistencia.crud.ServicioCrudRepository;
import com.beBolder.servitodo.persistencia.entity.Servicio;
import com.beBolder.servitodo.persistencia.mapper.ServicioDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServicioRepository implements ServicioDtoRepository {
    @Autowired
    private ServicioCrudRepository servicioCrudRepository;
    @Autowired
    private ServicioDtoMapper mapper;

    @Override
    public List<ServicioDto> getAll(){
        List<Servicio> servicios = (List<Servicio>) servicioCrudRepository.findAll();
        return mapper.toServicioDtos(servicios);
    }

    @Override
    public ServicioDto nuevoServicio(Servicio servicio){
        return mapper.toServicioDto(servicioCrudRepository.save(servicio));
    }
}
