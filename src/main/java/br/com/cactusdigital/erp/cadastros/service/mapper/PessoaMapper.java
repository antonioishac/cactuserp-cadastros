package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import br.com.cactusdigital.erp.cadastros.model.Pessoa;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaDTO;

@Mapper(componentModel = "spring", uses = { ContatoMapper.class })
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {	

	@Override
	@Mappings({ 
		@Mapping(target = "contatos", ignore = true) })
	Pessoa toEntity(PessoaDTO pessoa);

}
