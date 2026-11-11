package br.pucrs.nomeusuario.exemplo.adapters.gateways;

import br.pucrs.nomeusuario.exemplo.adapters.persistence.ProdutoEntity;
import br.pucrs.nomeusuario.exemplo.domain.models.Produto;

public class ProdutoEntityMapper {
    public ProdutoEntity toEntity(Produto produto) {
        return new ProdutoEntity(produto.getId(), produto.getDescricao(), produto.getPrecoUnitario());
    }
    public Produto toDomain(ProdutoEntity produtoEntity) {
        return new Produto(produtoEntity.getId(), produtoEntity.getDescricao(), produtoEntity.getPrecoUnitario());
    }

}


