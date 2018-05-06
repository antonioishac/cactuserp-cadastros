package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.PessoaFisicaDTO;

public interface PessoaFisicaService {
	
	PessoaFisicaDTO save(PessoaFisicaDTO dto);
	
	List<PessoaFisicaDTO> listarTodos();
	
	PessoaFisicaDTO buscarPessoaFisicaPeloCodigo(Long codigo);

}
