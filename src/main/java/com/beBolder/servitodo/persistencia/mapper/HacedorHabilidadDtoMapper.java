package com.beBolder.servitodo.persistencia.mapper;

import com.beBolder.servitodo.domain.dto.HacedorHabilidadDto;
import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {HacedorDtoMapper.class, HabilidadDtoMapper.class})
public interface HacedorHabilidadDtoMapper {

    HacedorHabilidadDto toHacedorHabilidadDto(HacedorHabilidad hacedorHabilidad);
    List<HacedorHabilidadDto> toHacedorHabilidadDtos(List<HacedorHabilidad> hacedorHabilidades);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "hacedor", ignore = true),
            @Mapping(target = "habilidad", ignore = true),
            @Mapping(target = "hacedorHabilidadID", ignore = true),
    })
    HacedorHabilidad toHacedorHabilidad(HacedorHabilidadDto hacedorHabilidadDto);

}
