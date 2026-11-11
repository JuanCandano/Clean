package br.pucrs.nomeusuario.exemplo.adapters.gateways;

import br.pucrs.nomeusuario.exemplo.adapters.persistence.ItemDeEstoqueEntity;
import br.pucrs.nomeusuario.exemplo.adapters.persistence.ProdutoEntity;
import br.pucrs.nomeusuario.exemplo.domain.models.*;

public class ItemDeEstoqueEntityMapper { 
    private ProdutoEntityMapper produtoEntityMapper;

    public ItemDeEstoqueEntityMapper(ProdutoEntityMapper produtoEntityMapper) {
        this.produtoEntityMapper = produtoEntityMapper;
    }

    public ItemDeEstoqueEntity toEntity(ItemDeEstoque itemDeEstoque) {
        ItemDeEstoqueEntity resultado = null;
        Produto produto = itemDeEstoque.getProduto();
        ProdutoEntity produtoEntity = produtoEntityMapper.toEntity(produto);
        resultado = new ItemDeEstoqueEntity(itemDeEstoque.getId(), produtoEntity, itemDeEstoque.getQuantidade(), itemDeEstoque.getEstoqueMin(), itemDeEstoque.getEstoqueMax());
        return resultado;
    }

    public ItemDeEstoque toDomain(ItemDeEstoqueEntity itemDeEstoqueEntity) {
        ItemDeEstoque resultado = null;
        ProdutoEntity produtoEntity = itemDeEstoqueEntity.getProduto();
        Produto produto = produtoEntityMapper.toDomain(produtoEntity);
        resultado = new ItemDeEstoque(itemDeEstoqueEntity.getId(), produto, itemDeEstoqueEntity.getQuantidade(), itemDeEstoqueEntity.getEstoqueMin(), itemDeEstoqueEntity.getEstoqueMax());
        return resultado;
    }

}
