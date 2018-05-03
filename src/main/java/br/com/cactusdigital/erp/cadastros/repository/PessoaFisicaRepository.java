package br.com.cactusdigital.erp.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.PessoaFisica;

/**
 * @author Antonio
 *
 * Implementacao Spring Data para transacoes pertinentes aos dados de pessoas fisicas
 *
 */
@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {

}
