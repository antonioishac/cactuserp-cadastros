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

import br.com.cactusdigital.erp.cadastros.service.TelefoneService;
import br.com.cactusdigital.erp.cadastros.service.dto.TelefoneDTO;

@RestController
@RequestMapping("/api/telefone")
public class TelefoneResource {
	
	@Autowired
	private TelefoneService service;
	
	@PostMapping
	public ResponseEntity<TelefoneDTO> criarTelefone(@RequestBody TelefoneDTO telefone) {
		TelefoneDTO telefoneSalvo = service.save(telefone); 
		return ResponseEntity.status(HttpStatus.CREATED).body(telefoneSalvo);
	}
	
	@GetMapping
	public ResponseEntity<?> listarTodos() {
		List<TelefoneDTO> lista = service.listarTodos();
		return ResponseEntity.ok().body(lista);
	}

}
