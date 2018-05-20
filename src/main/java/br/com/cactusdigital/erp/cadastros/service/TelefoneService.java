package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.TelefoneDTO;

/**
 * @author Antonio
 *
 */
public interface TelefoneService {

	TelefoneDTO save(TelefoneDTO dto);
	
	List<TelefoneDTO> listarTodos();
	
	List<TelefoneDTO> listarPorPessoa(Long codigoPessoa);
	
	TelefoneDTO buscarPeloCodigo(Long codigo);
	
	TelefoneDTO atualizar(TelefoneDTO dto);
	
}
