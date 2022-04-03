package com.beBolder.servitodo.persistencia.mapper;

import com.beBolder.servitodo.domain.dto.HacedorDto;
import com.beBolder.servitodo.persistencia.entity.Hacedor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {HacedorHabilidadDtoMapper.class, OfertaDtoMapper.class})
public interface HacedorDtoMapper {
    @Mappings({
            @Mapping(source = "hacedorID", target = "hacedorID")
    })
    HacedorDto toHacedorDto(Hacedor hacedor);
    List<HacedorDto> toHacedorDtos(List<Hacedor> hacedores);

    @InheritInverseConfiguration
    /*@Mappings({
            //@Mapping(target = "habilidades", ignore = true),
            @Mapping(target = "oferta", ignore = true)
    })*/
    @Mapping(target = "oferta", ignore = true)
    Hacedor toHacedor(HacedorDto hacedorDto);
}
