package br.com.cactusdigital.erp.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.EstadoCivil;

/**
 * @author Antonio
 *
 */
@Repository
public interface EstadoCivilRepository extends JpaRepository<EstadoCivil, Long> {

}
