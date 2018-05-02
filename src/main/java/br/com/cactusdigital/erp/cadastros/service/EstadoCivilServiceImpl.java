package br.com.cactusdigital.erp.cadastros.service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.cactusdigital.erp.cadastros.model.EstadoCivil;
import br.com.cactusdigital.erp.cadastros.repository.EstadoCivilRepository;
import br.com.cactusdigital.erp.cadastros.service.dto.EstadoCivilDTO;
import br.com.cactusdigital.erp.cadastros.service.mapper.EstadoCivilMapper;

/**
 * @author Antonio
 *
 */
@Service
public class EstadoCivilServiceImpl implements EstadoCivilService {
	
	private final String CODIGO = "codigo";

	@Autowired
	private EstadoCivilRepository repository;
	
	@Autowired
	private EstadoCivilMapper mapper;
	
	@Override
	public EstadoCivilDTO salvarEstadoCivil(EstadoCivilDTO dto) {
		EstadoCivil estadoCivil = mapper.toEntity(dto);
		estadoCivil = repository.save(estadoCivil);
		return mapper.toDto(estadoCivil);
	}

	@Override
	public List<EstadoCivilDTO> listarTodos() {
		List<EstadoCivilDTO> lista = repository.findAll().stream()
				.map(mapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
		return lista;
	}

	@Override
	public EstadoCivilDTO atualizarEstadoCivil(Long codigo, EstadoCivilDTO dto) {
		EstadoCivilDTO dtoSalvo = buscarPeloCodigo(codigo);		
		BeanUtils.copyProperties(dto, dtoSalvo, CODIGO);
		EstadoCivil entity = mapper.toEntity(dtoSalvo);				
		entity = repository.save(mapper.toEntity(dtoSalvo));
		return mapper.toDto(entity);
	}
	
	@Override
	public EstadoCivilDTO buscarPeloCodigo(Long codigo) {
		EstadoCivil estadoCivil = repository.findOne(codigo);
		if (estadoCivil == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return mapper.toDto(estadoCivil);
	}

	@Override
	public void deletarEstadoCivil(Long codigo) {
		this.repository.delete(codigo);
	}
}
