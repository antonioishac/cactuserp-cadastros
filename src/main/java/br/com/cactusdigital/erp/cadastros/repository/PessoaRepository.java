package br.com.cactusdigital.erp.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.Pessoa;

/**
 * @author Antonio Ishac
 *
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
