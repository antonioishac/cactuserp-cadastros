package br.com.cactusdigital.erp.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.Telefone;

/**
 * @author Antonio
 *
 */
@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
