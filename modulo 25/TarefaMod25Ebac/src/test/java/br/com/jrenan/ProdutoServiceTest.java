package test.java.br.com.jrenan;

import main.java.br.com.jrenan.dao.IProdutoDAO;
import main.java.br.com.jrenan.domain.Produto;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.jrenan.services.IProdutoService;
import main.java.br.com.jrenan.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.jrenan.dao.ProdutoDaoMock;

import java.math.BigDecimal;

public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setNome("Objeto");
        produto.setDescrição("1");
        produto.setCodigo("12345");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() {
        Produto produto = this.produtoService.buscarPorCodigoDoProduto(this.produto.getCodigo());
        Assert.assertNotNull(produto);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean retorno = produtoService.salvar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException {
        produto.setNome("Objeto");
        produtoService.alterar(produto);
        Assert.assertEquals("Objeto", produto.getNome());
    }
}
