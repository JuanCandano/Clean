package br.pucrs.nomeusuario.exemplo.application.usecases;

import br.pucrs.nomeusuario.exemplo.application.gateways.IItemDeEstoqueGateway;

public class QuantidadeDisponivelProdutoUC {
    private IItemDeEstoqueGateway itemEstoque;

    public QuantidadeDisponivelProdutoUC(IItemDeEstoqueGateway itemEstoque) {
        this.itemEstoque = itemEstoque;
    }

    public int qtdadeEmEstoque(long idProduto) {
        return itemEstoque.quantidadeEmEstoque(idProduto);
    }
    
}