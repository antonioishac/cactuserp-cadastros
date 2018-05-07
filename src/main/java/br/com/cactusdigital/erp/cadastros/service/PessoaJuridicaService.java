package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.PessoaJuridicaDTO;

/**
 * @author Antonio
 *
 */
public interface PessoaJuridicaService {
	
	PessoaJuridicaDTO save(PessoaJuridicaDTO dto);
	
	List<PessoaJuridicaDTO> listarTodos();
	
	PessoaJuridicaDTO buscarPeloCodigo(Long codigo);
	
	List<PessoaJuridicaDTO> buscarPeloNomeFantasia(String nome);
	
	PessoaJuridicaDTO buscarPeloCnpj(String cnpj);
	
	void excluirPessoaJuridica(Long codigo);
	
	PessoaJuridicaDTO atualizar(PessoaJuridicaDTO dto);

}
