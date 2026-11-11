package br.pucrs.nomeusuario.exemplo.application.usecases;

import java.util.List;

import br.pucrs.nomeusuario.exemplo.application.gateways.IProdutoGateway;
import br.pucrs.nomeusuario.exemplo.domain.models.Produto;

public class ProdutosDisponiveisUC {
    private IProdutoGateway produtos;

    public ProdutosDisponiveisUC(IProdutoGateway produtos){
        this.produtos = produtos;
    }

    public List<Produto> consultaProdutos() {
        List<Produto> resultado;
        resultado = produtos.todos();
        return resultado;
    }
}
