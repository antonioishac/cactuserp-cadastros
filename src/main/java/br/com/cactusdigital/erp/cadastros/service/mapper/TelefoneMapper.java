package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.cadastros.model.Telefone;
import br.com.cactusdigital.erp.cadastros.service.dto.TelefoneDTO;

@Mapper(componentModel="spring", uses = {PessoaMapper.class})
public interface TelefoneMapper extends EntityMapper<TelefoneDTO, Telefone> {

}
