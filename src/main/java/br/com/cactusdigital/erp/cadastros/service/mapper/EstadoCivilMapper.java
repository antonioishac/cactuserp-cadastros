package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.cadastros.model.EstadoCivil;
import br.com.cactusdigital.erp.cadastros.service.dto.EstadoCivilDTO;

@Mapper(componentModel="spring")
public interface EstadoCivilMapper extends EntityMapper<EstadoCivilDTO, EstadoCivil> {

}
