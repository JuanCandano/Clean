package br.pucrs.nomeusuario.exemplo.application.gateways;

import java.util.List;

import br.pucrs.nomeusuario.exemplo.domain.models.ItemDeEstoque;
import br.pucrs.nomeusuario.exemplo.domain.models.Produto;

public interface IItemDeEstoqueGateway {
    List<ItemDeEstoque> todos();
    List<Produto> todosComEstoque();
    int quantidadeEmEstoque(long codProd);
    void baixaEstoque(long codProd, int qtdade);
}