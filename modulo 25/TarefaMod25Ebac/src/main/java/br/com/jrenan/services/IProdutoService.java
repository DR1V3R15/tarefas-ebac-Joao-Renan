package main.java.br.com.jrenan.services;

import main.java.br.com.jrenan.domain.Produto;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author João Renan
 *
 * Projeto 2 - Modulo 25 Ebac
 *
 */

public interface IProdutoService {

    Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException;

    Produto buscarPorCodigoDoProduto(String codigo);

    void excluir(String codigo);

    void alterar(Produto produto) throws TipoChaveNaoEncontradaException;
}
