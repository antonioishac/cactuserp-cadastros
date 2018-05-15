package br.com.cactusdigital.erp.cadastros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.PessoaJuridica;
import br.com.cactusdigital.erp.cadastros.service.dto.PessoaJuridicaDTO;

/**
 * @author Antonio
 *
 */
@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {

	@Query(name = "buscarPessoaJuridicaPeloNome", nativeQuery = true)
	List<PessoaJuridicaDTO> buscarPessoaJuridicaPeloNome(String nome);

	// @Query(name="cad.buscarPessoaJuridicaPeloCnp", nativeQuery=true)
	// PessoaJuridicaSearchDTO buscarPessoaJuridicaPeloCnpj(String cnpj);

}
