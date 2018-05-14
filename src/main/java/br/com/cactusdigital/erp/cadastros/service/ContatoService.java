package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.ContatoDTO;

/**
 * @author Antonio
 *
 */
public interface ContatoService {
	
	ContatoDTO save(ContatoDTO dto);
	
	List<ContatoDTO> listarTodos();
	
	List<ContatoDTO> listarPorPessoa(Long codigoPessoa);
	
	ContatoDTO buscarPeloCodigo(Long codigo);
	
	ContatoDTO atualizar(ContatoDTO dto);

}
