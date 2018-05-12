package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.EnderecoDTO;

/**
 * @author Antonio
 *
 */
public interface EnderecoService {
	
	EnderecoDTO save(EnderecoDTO dto);
	
	List<EnderecoDTO> listarTodos();
	
	List<EnderecoDTO> listarPorPessoa(Long codigoPessoa);
	
	EnderecoDTO buscarPeloCodigo(Long codigo);
	
	EnderecoDTO atualizar(EnderecoDTO dto);

}
