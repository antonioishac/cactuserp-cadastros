package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.cadastros.model.Contato;
import br.com.cactusdigital.erp.cadastros.service.dto.ContatoDTO;

@Mapper(componentModel="spring", uses= {PessoaMapper.class})
public interface ContatoMapper extends EntityMapper<ContatoDTO, Contato> {
	
}
