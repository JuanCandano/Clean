package br.pucrs.nomeusuario.exemplo.adapters.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IItemDeEstoqueRepoJpa extends CrudRepository<ItemDeEstoqueEntity, Long> {
    ItemDeEstoqueEntity findByProdutoId(long produtoId);
    List<ItemDeEstoqueEntity> findAll();
}
