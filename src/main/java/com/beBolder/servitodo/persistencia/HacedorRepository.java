package com.beBolder.servitodo.persistencia;

import com.beBolder.servitodo.domain.dto.HacedorDto;
import com.beBolder.servitodo.domain.repository.HacedorDtoRepository;
import com.beBolder.servitodo.persistencia.crud.HacedorCrudRepository;
import com.beBolder.servitodo.persistencia.entity.Cliente;
import com.beBolder.servitodo.persistencia.entity.Hacedor;
import com.beBolder.servitodo.persistencia.mapper.HacedorDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HacedorRepository implements HacedorDtoRepository {
    @Autowired
    private HacedorCrudRepository hacedorCrudRepository;
    @Autowired
    private HacedorDtoMapper mapper;

    @Override
    public List<HacedorDto> getAll(){
        List<Hacedor> hacedores = (List<Hacedor>) hacedorCrudRepository.findAll();
        return mapper.toHacedorDtos(hacedores);
    }

    @Override
    public HacedorDto getDetallesHacedor(int hacedorID){
        return mapper.toHacedorDto(hacedorCrudRepository.findByHacedorID(hacedorID));
    }
    @Override
    public HacedorDto registrarHacedor(Hacedor hacedor){
        return mapper.toHacedorDto(hacedorCrudRepository.save(hacedor));
    }
    @Override
    public HacedorDto registrarDetallesHacedor(int hacedorID, Hacedor hacedor){
        Hacedor hacedorAct = hacedorCrudRepository.findByHacedorID(hacedorID);
        if (!hacedor.getNumeroContacto().equals(null)) {
            hacedorAct.setRangoTrabajo(hacedor.getRangoTrabajo());
        }
        hacedorAct.setNumeroContacto(hacedor.getNumeroContacto());
        return mapper.toHacedorDto(hacedorCrudRepository.save(hacedorAct));
    }

    @Override
    public HacedorDto authHacedor(String email) {
        Hacedor hacedor = hacedorCrudRepository.findByEmail(email);
        if (hacedor.equals(null)){
            hacedor = null;
        }
        return mapper.toHacedorDto(hacedor);
    }
}
