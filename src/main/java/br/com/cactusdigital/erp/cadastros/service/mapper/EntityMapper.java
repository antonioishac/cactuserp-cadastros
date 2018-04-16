package br.com.cactusdigital.erp.cadastros.service.mapper;

import java.util.List;

/**
 * @author Antonio Ishac
 *
 * @param <D> - DTO type parameter.
 * @param <E> - Entity type parameter.
 */
public interface EntityMapper<D, E> {

	E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);

}
