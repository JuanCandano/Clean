package br.pucrs.nomeusuario.exemplo.adapters.persistence;

import java.util.List;

import br.pucrs.nomeusuario.exemplo.application.gateways.IItemDeEstoqueGateway;
import br.pucrs.nomeusuario.exemplo.domain.models.ItemDeEstoque;
import br.pucrs.nomeusuario.exemplo.domain.models.Produto;

public class ItemDeEstoqueRepoJpaImpl implements IItemDeEstoqueGateway {
    private IItemDeEstoqueRepoJpa repositorio;
    private IProdutoRepoJpa repositorioProduto;

    public ItemDeEstoqueRepoJpaImpl(IItemDeEstoqueRepoJpa repositorio, IProdutoRepoJpa repositorioProduto) {
        this.repositorio = repositorio;
        this.repositorioProduto = repositorioProduto;
    }

    @Override
    public void baixaEstoque(long codProd, int qtdade) {

    }

    @Override
    public int quantidadeEmEstoque(long codProd) {
        ProdutoEntity produto = repositorioProduto.findById(codProd);
        if(produto == null) 
            return -1;
        List<ItemDeEstoqueEntity> itens = repositorio.findAll();
        for(ItemDeEstoqueEntity item : itens) {
            if(item.getProduto().getId() == codProd) {
                return item.getQuantidade();
            }
        }
        return 0;
    }

    @Override
    public List<ItemDeEstoque> todos() {
        return null;
    }

    @Override
    public List<Produto> todosComEstoque() {
        return null;
    }


}
