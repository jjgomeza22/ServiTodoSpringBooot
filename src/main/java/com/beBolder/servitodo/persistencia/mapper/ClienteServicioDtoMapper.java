package com.beBolder.servitodo.persistencia.mapper;

import com.beBolder.servitodo.domain.dto.ClienteServicioDto;
import com.beBolder.servitodo.persistencia.entity.ClienteServicio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ClienteDtoMapper.class, ServicioDtoMapper.class})
public interface ClienteServicioDtoMapper {

     ClienteServicioDto toClienteSevicioDto(ClienteServicio clienteServicio);

     @InheritInverseConfiguration
     @Mappings({
             @Mapping(target = "cliente", ignore = true),
             @Mapping(target = "servicio", ignore = true),
     })
     ClienteServicio toClienteServicio(ClienteServicioDto clienteServicioDto);


}
