package com.beBolder.servitodo.persistencia.mapper;

import com.beBolder.servitodo.domain.dto.HabilidadDto;
import com.beBolder.servitodo.persistencia.entity.Habilidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {HacedorHabilidadDtoMapper.class})
public interface HabilidadDtoMapper {
    @Mappings({
            @Mapping(source = "habilidadID", target = "habilidadID")
    })
    HabilidadDto toHabilidadDto(Habilidad habilidad);
    List<HabilidadDto> toHabilidadDtos(List<Habilidad> habilidades);

    @InheritInverseConfiguration
    @Mapping(target = "hacedores", ignore = true)
    Habilidad toHabilidad(HabilidadDto habilidadDto);

}
