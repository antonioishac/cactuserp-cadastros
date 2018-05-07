package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.cadastros.model.PessoaFisica;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaFisicaDTO;

@Mapper(componentModel="spring", uses = {EstadoCivilMapper.class, PessoaMapper.class})
public interface PessoaFisicaMapper extends EntityMapper<PessoaFisicaDTO, PessoaFisica> {

}
