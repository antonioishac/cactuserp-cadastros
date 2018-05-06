package br.com.cactusdigital.erp.cadastros.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cactusdigital.erp.cadastros.service.PessoaFisicaService;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaFisicaDTO;

/**
 * @author Antonio
 *
 */
@RestController
@RequestMapping("/api/pessoa-fisica")
public class PessoaFisicaResource {

	/**
	 * Injecao para o servico de pessoa fisica
	 *	 
	 */
	@Autowired
	private PessoaFisicaService service;
	
	/**
	 * 
	 * Metodo POST para gravar os dados de pessoa fisica
	 * 
	 * @param pessoaFisica
	 * @return PessoaFisica
	 */
	@PostMapping
	public ResponseEntity<PessoaFisicaDTO> criarPessoaFisica(@RequestBody PessoaFisicaDTO pessoaFisica) {
		PessoaFisicaDTO pFisica = service.save(pessoaFisica);
		return ResponseEntity.status(HttpStatus.CREATED).body(pFisica);
	}
	
	@GetMapping
	public List<PessoaFisicaDTO> listarPessoaFisica() {
		return service.listarTodos();
	}
}
