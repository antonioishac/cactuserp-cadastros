package br.com.cactusdigital.erp.cadastros.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cactusdigital.erp.cadastros.model.Contato;
import br.com.cactusdigital.erp.cadastros.repository.ContatoRepository;
import br.com.cactusdigital.erp.cadastros.service.ContatoService;
import br.com.cactusdigital.erp.cadastros.service.dto.ContatoDTO;
import br.com.cactusdigital.erp.cadastros.service.mapper.ContatoMapper;

/**
 * @author Antonio
 *
 */
@Service
public class ContatoServiceImpl implements ContatoService {

	@Autowired
	private ContatoRepository repository;
	
	@Autowired
	private ContatoMapper mapper;
	
	@Override
	public ContatoDTO save(ContatoDTO dto) {
		Contato contato = mapper.toEntity(dto);
		contato = repository.save(contato);
		return mapper.toDto(contato);
	}

	@Override
	public List<ContatoDTO> listarTodos() {
		List<ContatoDTO> lista = repository.findAll().stream()
				.map(mapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
		return lista;
	}

	@Override
	public List<ContatoDTO> listarPorPessoa(Long codigoPessoa) {		
		return null;
	}

	@Override
	public ContatoDTO buscarPeloCodigo(Long codigo) {		
		return null;
	}

	@Override
	public ContatoDTO atualizar(ContatoDTO dto) {		
		return null;
	}

}
