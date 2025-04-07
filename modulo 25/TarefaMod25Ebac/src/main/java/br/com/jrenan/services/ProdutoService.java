package main.java.br.com.jrenan.services;

import main.java.br.com.jrenan.dao.IProdutoDAO;
import main.java.br.com.jrenan.domain.Produto;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoService implements IProdutoService {

    private IProdutoDAO produtoDAO;

    public ProdutoService(IProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    @Override
    public Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException {
        return produtoDAO.cadastrar(produto);
    }

    @Override
    public Produto buscarPorCodigoDoProduto(String codigo) {
        return produtoDAO.consultar(codigo);
    }

    @Override
    public void excluir(String codigo) {
        produtoDAO.excluir(codigo);
    }

    @Override
    public void alterar(Produto produto) throws TipoChaveNaoEncontradaException {
        produtoDAO.alterar(produto);
    }
}