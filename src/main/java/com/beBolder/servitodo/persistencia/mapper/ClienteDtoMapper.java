package com.beBolder.servitodo.persistencia.mapper;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.persistencia.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OfertaDtoMapper.class, ClienteServicioDtoMapper.class})
public interface ClienteDtoMapper {
    @Mappings({
            @Mapping(source = "clienteID", target = "clienteID")
    })
    ClienteDto toClienteDto(Cliente cliente);
    List<ClienteDto> toClienteDtos(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping( target = "ofertas", ignore = true),
            @Mapping( target = "servicios", ignore = true)
    })
    Cliente toCliente(ClienteDto clienteDto);
}
