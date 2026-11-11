package br.pucrs.nomeusuario.exemplo.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.pucrs.nomeusuario.exemplo.adapters.gateways.*;
import br.pucrs.nomeusuario.exemplo.adapters.persistence.*;
import br.pucrs.nomeusuario.exemplo.application.gateways.*;
import br.pucrs.nomeusuario.exemplo.application.usecases.*;

/**
 * Criacao de componentes do Spring Boot para injeção de dependências.
 * ACMEConfig
 */

@Configuration 
public class ACMEConfig {

    @Bean 
    ProdutoEntityMapper produtoEntityMapper() {
        return new ProdutoEntityMapper();
    }

    @Bean 
    ProdutoRepoJpaImpl produtoRepoJpaImpl(IProdutoRepoJpa iProdutoRepoJpa, ProdutoEntityMapper produtoEntityMapper) {
        return new ProdutoRepoJpaImpl(iProdutoRepoJpa, produtoEntityMapper);
    }

    @Bean 
    ProdutosDisponiveisUC produtosDisponiveisUC(IProdutoGateway produtoGateway) {
        return new ProdutosDisponiveisUC(produtoGateway);
    }

    @Bean 
    ItemDeEstoqueRepoJpaImpl itemDeEstoqueRepoJpaImpl(IItemDeEstoqueRepoJpa repositorio, IProdutoRepoJpa repositorioProduto) {
        return new ItemDeEstoqueRepoJpaImpl(repositorio, repositorioProduto);
    }

    @Bean
    QuantidadeDisponivelProdutoUC quantidadeDisponivelProdutoUC(IItemDeEstoqueGateway itemEstoqueGateway) {
        return new QuantidadeDisponivelProdutoUC(itemEstoqueGateway);
    }
}
