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

import br.com.cactusdigital.erp.cadastros.service.EnderecoService;
import br.com.cactusdigital.erp.cadastros.service.dto.EnderecoDTO;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService service;
	
	@PostMapping
	public ResponseEntity<EnderecoDTO> criarEndereco(@RequestBody EnderecoDTO enderecoDTO) {
		EnderecoDTO enderecoSalvo = service.save(enderecoDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
	}
	
	@GetMapping
	public List<EnderecoDTO> listarEndereco() {
		return service.listarTodos();
	}

}
