package br.com.cactusdigital.erp.cadastros.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.cactusdigital.erp.cadastros.model.PessoaFisica;
import br.com.cactusdigital.erp.cadastros.repository.PessoaFisicaRepository;
import br.com.cactusdigital.erp.cadastros.service.PessoaFisicaService;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaFisicaDTO;
import br.com.cactusdigital.erp.cadastros.service.mapper.PessoaFisicaMapper;

/**
 * @author Antonio
 *
 */
@Service
public class PessoaFisicaServiceImpl implements PessoaFisicaService {
	
	@Autowired
	private PessoaFisicaRepository repository;
	
	@Autowired
	private PessoaFisicaMapper mapper;

	@Override
	public PessoaFisicaDTO save(PessoaFisicaDTO dto) {
		PessoaFisica pessoaFisica = mapper.toEntity(dto);
		pessoaFisica = repository.save(pessoaFisica);
		return mapper.toDto(pessoaFisica);
	}

	@Override
	public List<PessoaFisicaDTO> listarTodos() {
		List<PessoaFisicaDTO> lista = repository.findAll().stream()
				.map(mapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
		return lista;
	}

	@Override
	public PessoaFisicaDTO buscarPessoaFisicaPeloCodigo(Long codigo) {
		PessoaFisica pessoaFisica = repository.findOne(codigo);
		if (pessoaFisica.getCodigo() == null) {
			throw new EmptyResultDataAccessException(1); 
		}
		return mapper.toDto(pessoaFisica);
	}

}
