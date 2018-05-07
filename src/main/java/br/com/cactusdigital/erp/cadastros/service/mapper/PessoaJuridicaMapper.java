package br.com.cactusdigital.erp.cadastros.service.mapper;

import org.mapstruct.Mapper;

import br.com.cactusdigital.erp.cadastros.model.PessoaJuridica;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaJuridicaDTO;

/**
 * @author Antonio
 *
 */
@Mapper(componentModel="spring", uses = {PessoaMapper.class})
public interface PessoaJuridicaMapper extends EntityMapper<PessoaJuridicaDTO, PessoaJuridica> {

}
