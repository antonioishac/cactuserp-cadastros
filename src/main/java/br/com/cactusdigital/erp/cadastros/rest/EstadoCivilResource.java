package br.com.cactusdigital.erp.cadastros.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cactusdigital.erp.cadastros.service.EstadoCivilService;
import br.com.cactusdigital.erp.cadastros.service.dto.EstadoCivilDTO;

/**
 * @author Antonio
 * 
 * Classe REST responsavel para expor os servicos referente ao estado civil
 *
 */
@RestController
@RequestMapping("/api/estado-civil")
public class EstadoCivilResource {
	
	/**
	 * Injecao de dependencia para as transacoes dos dados referente a estado civil
	 */
	@Autowired
	private EstadoCivilService service;
	
	/**
	 * Metodo REST para criar um estado civil
	 * 
	 * @param EstadoCivilDTO
	 * @return EstadoCivilDTO
	 */
	@PostMapping
	public ResponseEntity<EstadoCivilDTO> criarEstadoCivil(@RequestBody EstadoCivilDTO dto) {
		EstadoCivilDTO estadoCivilSalvo = service.salvarEstadoCivil(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(estadoCivilSalvo);
	}
	
	@GetMapping
	public List<EstadoCivilDTO> listarTodos() {
		return service.listarTodos();
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<EstadoCivilDTO> buscarEstadoCivilPeloCodigo(@PathVariable Long codigo) {
		EstadoCivilDTO dtoEstadoCivil = service.buscarPeloCodigo(codigo);
		return dtoEstadoCivil != null ? ResponseEntity.ok(dtoEstadoCivil) : ResponseEntity.noContent().build();
	}

}
