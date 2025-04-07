package test.java.br.com.jrenan;

import main.java.br.com.jrenan.dao.IProdutoDAO;
import main.java.br.com.jrenan.domain.Produto;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.jrenan.dao.ProdutoDaoMock;

import java.math.BigDecimal;

public class ProdutoDAOTest {

    private IProdutoDAO produtoDao;

    private Produto produto;

    public ProdutoDAOTest() {
        produtoDao = new ProdutoDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setNome("Objeto");
        produto.setDescrição("1");
        produto.setCodigo("12345");
        produto.setValor(BigDecimal.TEN);
        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisarProduto() {
        Produto produto = this.produtoDao.consultar(this.produto.getCodigo());
        Assert.assertNotNull(produto);
    }

    @Test
    public void excluirProduto() {
        produtoDao.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException {
        produto.setNome("Objeto");
        produtoDao.alterar(produto);
        Assert.assertEquals("Objeto", produto.getNome());
    }
}
