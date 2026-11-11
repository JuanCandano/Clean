package br.pucrs.nomeusuario.exemplo.adapters.persistence;

import java.util.List;
import org.springframework.stereotype.Repository;
import br.pucrs.nomeusuario.exemplo.adapters.gateways.ProdutoEntityMapper;
import br.pucrs.nomeusuario.exemplo.application.gateways.IProdutoGateway;
import br.pucrs.nomeusuario.exemplo.domain.models.Produto;

@Repository 
public class ProdutoRepoJpaImpl implements IProdutoGateway {
    private final IProdutoRepoJpa repositorio;
    private final ProdutoEntityMapper mapper;

    public ProdutoRepoJpaImpl(IProdutoRepoJpa repositorio, ProdutoEntityMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = new ProdutoEntityMapper();
    }

    @Override
    public List<Produto> todos() {
        List<ProdutoEntity> entities = repositorio.findAll();
        return entities.stream()
                .map(e -> mapper.toDomain(e))
                .toList();
    }

    @Override
    public Produto consultaPorId(long codigo) {
        ProdutoEntity resultado = repositorio.findById(codigo);
        if(resultado != null) {
            return mapper.toDomain(resultado);
        } else {
            return null;
        }
    }

}
