package br.com.cactusdigital.erp.cadastros.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cactusdigital.erp.cadastros.model.PessoaFisica;
import br.com.cactusdigital.erp.cadastros.repository.PessoaFisicaRepository;

/**
 * @author Antonio
 *
 */
@RestController
@RequestMapping("/api/pessoa-fisica")
public class PessoaFisicaResource {

	/**
	 * Injecao temporaria para transacoes com o banco
	 * 
	 * TODO mudar para service
	 */
	@Autowired
	private PessoaFisicaRepository repository;
	
	/**
	 * 
	 * Metodo POST para gravar os dados de pessoa fisica
	 * 
	 * @param pessoaFisica
	 * @return PessoaFisica
	 */
	@PostMapping
	public ResponseEntity<PessoaFisica> criarPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
		PessoaFisica pFisica = repository.save(pessoaFisica);
		return ResponseEntity.status(HttpStatus.CREATED).body(pFisica);
	}
}
