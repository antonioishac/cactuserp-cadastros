package br.com.cactusdigital.erp.cadastros.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cactusdigital.erp.cadastros.model.Pessoa;
import br.com.cactusdigital.erp.cadastros.repository.PessoaRepository;
import br.com.cactusdigital.erp.cadastros.service.PessoaService;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaDTO;
import br.com.cactusdigital.erp.cadastros.service.mapper.PessoaMapper;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository repository;

	@Autowired
	private PessoaMapper mapper;

	@Override
	public PessoaDTO salvarPessoa(PessoaDTO pessoaDTO) {
		Pessoa pessoa = mapper.toEntity(pessoaDTO);
		pessoa = repository.save(pessoa);
		return mapper.toDto(pessoa);
	}

	@Override
	public List<PessoaDTO> listarTodos() {
		List<PessoaDTO> listPessoaDTO = repository.findAll().stream()
				.map(mapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
		return listPessoaDTO;
	}

	@Override
	public PessoaDTO buscarPessoaPeloCodigo(Long codigo) {
		Pessoa pessoa = repository.findOne(codigo);
		return mapper.toDto(pessoa);
	}

}
