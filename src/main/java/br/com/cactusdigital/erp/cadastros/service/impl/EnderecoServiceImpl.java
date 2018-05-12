package br.com.cactusdigital.erp.cadastros.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cactusdigital.erp.cadastros.model.Endereco;
import br.com.cactusdigital.erp.cadastros.repository.EnderecoRepository;
import br.com.cactusdigital.erp.cadastros.service.EnderecoService;
import br.com.cactusdigital.erp.cadastros.service.dto.EnderecoDTO;
import br.com.cactusdigital.erp.cadastros.service.mapper.EnderecoMapper;

/**
 * @author Antonio
 *
 */
@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository repository;
	
	@Autowired
	private EnderecoMapper mapper;
	
	@Override	
	public EnderecoDTO save(EnderecoDTO dto) {		
		Endereco endereco = mapper.toEntity(dto);
		endereco = repository.save(endereco);
		return mapper.toDto(endereco);
	}

	@Override	
	public List<EnderecoDTO> listarTodos() {
		List<EnderecoDTO> lista = repository.findAll()
				.stream()
				.map(mapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
		return lista;
	}

	@Override
	public List<EnderecoDTO> listarPorPessoa(Long codigoPessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnderecoDTO buscarPeloCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnderecoDTO atualizar(EnderecoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
