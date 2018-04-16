package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.cadastros.model.Pessoa;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaDTO;

@Mapper(componentModel="spring")
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {

}
