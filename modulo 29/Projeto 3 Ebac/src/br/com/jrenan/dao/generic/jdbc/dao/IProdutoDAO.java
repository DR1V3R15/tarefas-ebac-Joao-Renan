package br.com.jrenan.dao.generic.jdbc.dao;

import br.com.jrenan.domain.Produto;

import java.util.List;

/**
 * @author João Renan
 *
 * Projeto 3 Back-End Java, Ebac
 */

public interface IProdutoDAO {

    public Integer registrar(Produto produto) throws Exception;

    public Produto buscar(String codigo) throws Exception;

    public Integer atualizar(Produto produto) throws Exception;

    public Integer deletar(Produto produto) throws Exception;

    public List<Produto> buscarTodos() throws Exception;
}
