package br.com.cactusdigital.erp.cadastros.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cactusdigital.erp.cadastros.service.PessoaService;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaDTO;

/**
 *
 * Classe REST para expor os servi\u00e7os
 *
 * @author Antonio Ishac
 *
 */
@RestController
@RequestMapping("/api/pessoa")
public class PessoaResource {

	/**
	 * Inje\u00e7\u00e3o para o servi\u00e7o de pessoa
	 */
	@Autowired
	private PessoaService service;

	/**
	 * M\u00e9todo REST para criar uma pessoa.
	 *
	 * @param pessoaDTO
	 * @return
	 */
	@PostMapping
	public ResponseEntity<PessoaDTO> criarPessoa(@RequestBody PessoaDTO pessoa) {
		PessoaDTO pessoaSalva = service.salvarPessoa(pessoa);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalva);
	}

}
