package br.com.cactusdigital.erp.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cactusdigital.erp.cadastros.model.Endereco;

/**
 * @author Antonio
 *
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
