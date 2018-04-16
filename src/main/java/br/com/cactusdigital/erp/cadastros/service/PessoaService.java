package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.PessoaDTO;

/**
 * @author Antonio Ishac
 *
 */
public interface PessoaService {

	PessoaDTO salvarPessoa(PessoaDTO pessoaDTO);

	List<PessoaDTO> listarTodos();

	PessoaDTO buscarPessoaPeloCodigo(Long codigo);

}
