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

import br.com.cactusdigital.erp.cadastros.service.ContatoService;
import br.com.cactusdigital.erp.cadastros.service.dto.ContatoDTO;

@RestController
@RequestMapping("/api/contato")
public class ContatoResource {
	
	@Autowired
	private ContatoService service;
	
	@PostMapping
	public ResponseEntity<ContatoDTO> criarContato(@RequestBody ContatoDTO contatoDTO) {
		ContatoDTO contatoSalvo = service.save(contatoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(contatoSalvo);
	}
	
	@GetMapping
	public List<ContatoDTO> listarTodos(){
		return service.listarTodos();
	}

}
