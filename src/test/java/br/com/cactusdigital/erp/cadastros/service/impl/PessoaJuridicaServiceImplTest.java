package br.com.cactusdigital.erp.cadastros.service.impl;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.cactusdigital.erp.cadastros.model.Pessoa;
import br.com.cactusdigital.erp.cadastros.model.PessoaJuridica;
import br.com.cactusdigital.erp.cadastros.repository.PessoaJuridicaRepository;
import br.com.cactusdigital.erp.cadastros.repository.PessoaRepository;
import br.com.cactusdigital.erp.cadastros.service.PessoaJuridicaService;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaJuridicaDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaJuridicaServiceImplTest {

	@Autowired
	private transient PessoaJuridicaService pessoaJuridicaService;

	@Autowired
	private transient PessoaRepository pessoaRepository;

	@Autowired
	private transient PessoaJuridicaRepository pessoaJuridicaRepository;

	private Pessoa pessoa;
	private PessoaJuridica pessoaJuridica;

	@Before
	public void init() {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("nome Jesus");
		pessoa.setCliente("C");
		pessoa.setEmail("email");
		pessoa.setTipoPessoa("J");
		pessoa.setSite("www");
		pessoa.setFornecedor("F");
		pessoa.setColaborador("C");
		pessoa.setTransportadora("T");
		
		this.pessoa = this.pessoaRepository.save(pessoa);

		PessoaJuridica jesus = new PessoaJuridica();
		jesus.setCnpj("1234");
		jesus.setNomeFantasia("Jesus");
		jesus.setPessoa(pessoa);
		this.pessoaJuridica = this.pessoaJuridicaRepository.save(jesus);

	}

	@After
	public void end() {
		this.pessoaJuridicaRepository.delete(pessoaJuridica);
		this.pessoaRepository.delete(pessoa);
	}

	@Test
	public void buscarPessoaJuridicaPeloNome() {
		List<PessoaJuridicaDTO> result = pessoaJuridicaService.buscarPeloNomeFantasia("Jesus");

		Assert.assertNotNull(result);
		Assert.assertFalse(result.isEmpty());
		
		result.forEach(pesosa -> {
			pessoa.getNome().contains("Jesus");
		});
		
	}

}
