package com.beBolder.servitodo.persistencia.mapper;

import com.beBolder.servitodo.domain.dto.ServicioDto;
import com.beBolder.servitodo.persistencia.entity.Servicio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ClienteDtoMapper.class, OfertaDtoMapper.class})
public interface ServicioDtoMapper {
    @Mappings({
            @Mapping(source = "servicioID", target = "servicioID"),
    })
    ServicioDto toServicioDto(Servicio servicio);
    List<ServicioDto> toServicioDtos(List<Servicio> servicios);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "ofertas", ignore = true),
            @Mapping(target = "clientes", ignore = true)
    })
    Servicio toServicio(ServicioDto servicioDto);

}
