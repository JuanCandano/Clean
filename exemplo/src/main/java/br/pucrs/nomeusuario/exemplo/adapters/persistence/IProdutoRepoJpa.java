package br.pucrs.nomeusuario.exemplo.adapters.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepoJpa extends JpaRepository<ProdutoEntity, Long> {
    List<ProdutoEntity> findAll();
    ProdutoEntity findById(long id);
}
