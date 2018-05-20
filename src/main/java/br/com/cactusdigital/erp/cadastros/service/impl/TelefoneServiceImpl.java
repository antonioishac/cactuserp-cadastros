package br.com.cactusdigital.erp.cadastros.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cactusdigital.erp.cadastros.model.Telefone;
import br.com.cactusdigital.erp.cadastros.repository.TelefoneRepository;
import br.com.cactusdigital.erp.cadastros.service.TelefoneService;
import br.com.cactusdigital.erp.cadastros.service.dto.TelefoneDTO;
import br.com.cactusdigital.erp.cadastros.service.mapper.TelefoneMapper;

/**
 * @author Antonio
 *
 */
@Service
public class TelefoneServiceImpl implements TelefoneService {

	@Autowired
	private TelefoneRepository repository;
	
	@Autowired
	private TelefoneMapper mapper;
	
	@Override
	public TelefoneDTO save(TelefoneDTO dto) {
		Telefone telefone = mapper.toEntity(dto);
		telefone = repository.save(telefone);
		return mapper.toDto(telefone);
	}

	@Override
	public List<TelefoneDTO> listarTodos() {
		List<TelefoneDTO> lista = repository.findAll().stream()
				.map(mapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
		return lista;
	}

	@Override
	public List<TelefoneDTO> listarPorPessoa(Long codigoPessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TelefoneDTO buscarPeloCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TelefoneDTO atualizar(TelefoneDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
