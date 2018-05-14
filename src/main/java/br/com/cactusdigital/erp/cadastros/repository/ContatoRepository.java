package br.com.cactusdigital.erp.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.Contato;

/**
 * @author Antonio
 *
 */
@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
