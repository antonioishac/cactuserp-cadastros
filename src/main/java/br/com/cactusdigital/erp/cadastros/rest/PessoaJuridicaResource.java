package br.com.cactusdigital.erp.cadastros.rest;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cactusdigital.erp.cadastros.service.PessoaJuridicaService;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaJuridicaDTO;

@RestController
@RequestMapping("/api/pessoa-juridica")
public class PessoaJuridicaResource {
	
	@Autowired
	private PessoaJuridicaService service;
	
	@PostMapping
	public ResponseEntity<PessoaJuridicaDTO> criarPessoaJuridica(@RequestBody PessoaJuridicaDTO pessoaJuridica){
		PessoaJuridicaDTO pJuridicaSalvo = service.save(pessoaJuridica);
		return ResponseEntity.status(HttpStatus.CREATED).body(pJuridicaSalvo);
	}
	
	@GetMapping
	public List<PessoaJuridicaDTO> listarTodos() {
		return service.listarTodos();
	}
	
	@GetMapping("/{nome}")
	public List<PessoaJuridicaDTO> listaPessoaJuridicaPeloNome(@PathVariable String nome){
		return service.buscarPeloNomeFantasia(nome.equals(StringUtils.EMPTY) ? "" : nome);
	}

}
