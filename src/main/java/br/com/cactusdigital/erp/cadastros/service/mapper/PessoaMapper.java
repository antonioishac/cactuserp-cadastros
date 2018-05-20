package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.cadastros.model.Pessoa;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaDTO;

@Mapper(componentModel="spring", uses = {PessoaFisicaMapper.class, PessoaJuridicaMapper.class, ContatoMapper.class, EnderecoMapper.class, TelefoneMapper.class})
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {

}
