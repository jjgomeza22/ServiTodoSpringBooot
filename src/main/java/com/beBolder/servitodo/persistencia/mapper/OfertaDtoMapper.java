package com.beBolder.servitodo.persistencia.mapper;

import com.beBolder.servitodo.domain.dto.OfertaDto;
import com.beBolder.servitodo.persistencia.entity.Oferta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ClienteDtoMapper.class, HacedorDtoMapper.class, ServicioDtoMapper.class})
public interface OfertaDtoMapper {
    @Mappings({
            @Mapping(source = "ofertaID", target = "ofertaID")
    })
    OfertaDto toOfertaDto(Oferta oferta);
    List<OfertaDto> toOfertaDtos(List<Oferta> ofertas);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "cliente", ignore = true),
            @Mapping(target = "hacedor", ignore = true),
            @Mapping(target = "servicio", ignore = true),
    })
    Oferta toOferta(OfertaDto Oferta);
}
