package br.com.cactusdigital.erp.cadastros.service;

import java.util.List;

import br.com.cactusdigital.erp.cadastros.service.dto.EstadoCivilDTO;

/**
 * @author Antonio
 *
 */
public interface EstadoCivilService {
	
	EstadoCivilDTO salvarEstadoCivil(EstadoCivilDTO dto);
	
	EstadoCivilDTO atualizarEstadoCivil(Long codigo, EstadoCivilDTO dto);
	
	void deletarEstadoCivil(Long codigo);
	
	List<EstadoCivilDTO> listarTodos();
	
	EstadoCivilDTO buscarPeloCodigo(Long codigo);

}
