package br.com.cactusdigital.erp.cadastros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cactusdigital.erp.cadastros.model.PessoaJuridica;
import br.com.cactusdigital.erp.cadastros.repository.PessoaJuridicaRepository;
import br.com.cactusdigital.erp.cadastros.service.PessoaJuridicaService;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaJuridicaDTO;
import br.com.cactusdigital.erp.cadastros.service.mapper.PessoaJuridicaMapper;

/**
 * @author Antonio
 *
 */
@Service
@Transactional
public class PessoaJuridicaServiceImpl implements PessoaJuridicaService {
	
	@Autowired
	private PessoaJuridicaRepository repository;
	
	@Autowired
	private PessoaJuridicaMapper mapper;

	@Override
	@Transactional
	public PessoaJuridicaDTO save(PessoaJuridicaDTO dto) {
		PessoaJuridica pJuridica = mapper.toEntity(dto);
		pJuridica = repository.save(pJuridica);
		return mapper.toDto(pJuridica);
	}

	@Override
	@Transactional(readOnly=true)
	public List<PessoaJuridicaDTO> listarTodos() {
		List<PessoaJuridica> lista = repository.findAll();
		return mapper.toDto(lista);
	}

	@Override
	@Transactional(readOnly=true)
	public PessoaJuridicaDTO buscarPeloCodigo(Long codigo) {
		PessoaJuridica pJuridica = repository.findOne(codigo);
		return mapper.toDto(pJuridica);
	}

	@Override
	@Transactional(readOnly=true)
	public List<PessoaJuridicaDTO> buscarPeloNomeFantasia(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public PessoaJuridicaDTO buscarPeloCnpj(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void excluirPessoaJuridica(Long codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public PessoaJuridicaDTO atualizar(PessoaJuridicaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
