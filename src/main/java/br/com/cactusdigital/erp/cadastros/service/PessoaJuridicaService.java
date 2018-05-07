package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.PessoaJuridicaDTO;
import br.com.cactusdigital.erp.cadastros.service.dto.search.PessoaJuridicaSearchDTO;

/**
 * @author Antonio
 *
 */
public interface PessoaJuridicaService {
	
	PessoaJuridicaDTO save(PessoaJuridicaDTO dto);
	
	List<PessoaJuridicaDTO> listarTodos();
	
	PessoaJuridicaDTO buscarPeloCodigo(Long codigo);
	
	List<PessoaJuridicaSearchDTO> buscarPeloNomeFantasia(String nome);
	
	PessoaJuridicaDTO buscarPeloCnpj(String cnpj);
	
	void excluirPessoaJuridica(Long codigo);
	
	PessoaJuridicaDTO atualizar(PessoaJuridicaDTO dto);

}
