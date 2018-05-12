package br.com.cactusdigital.erp.cadastros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.PessoaJuridica;
import br.com.cactusdigital.erp.cadastros.service.dto.search.PessoaJuridicaSearchDTO;

/**
 * @author Antonio
 *
 */
@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
	
	@Query(name="cad.buscarPessoaJuridicaPeloNome", nativeQuery=true)
	List<PessoaJuridicaSearchDTO> buscarPessoaJuridicaPeloNome(String nome);
	
	@Query(name="cad.buscarPessoaJuridicaPeloNome", nativeQuery=true)
	PessoaJuridicaSearchDTO buscarPessoaJuridicaPeloCnpj(String cnpj);

}
