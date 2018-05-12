package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;


import br.com.cactusdigital.erp.cadastros.model.Endereco;
import br.com.cactusdigital.erp.cadastros.service.dto.EnderecoDTO;


@Mapper(componentModel="spring", uses = {PessoaMapper.class})
public interface EnderecoMapper extends EntityMapper<EnderecoDTO, Endereco> {

}
