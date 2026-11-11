package br.pucrs.nomeusuario.exemplo.application.gateways;

import java.util.List;
import br.pucrs.nomeusuario.exemplo.domain.models.Produto;

public interface IProdutoGateway {
    List<Produto> todos();
    Produto consultaPorId(long codigo);
}
