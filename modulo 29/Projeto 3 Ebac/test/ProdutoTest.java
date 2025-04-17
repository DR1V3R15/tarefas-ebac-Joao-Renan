import br.com.jrenan.dao.generic.jdbc.dao.IProdutoDAO;
import br.com.jrenan.dao.generic.jdbc.dao.ProdutoDAO;
import br.com.jrenan.domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author João Renan
 *
 * Projeto 3 Back-End Java, Ebac
 */

public class ProdutoTest {

    @Test
    public void registrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("12345");
        produto.setNome("Objeto 1");
        Integer quant = dao.registrar(produto);
        assertTrue(quant == 1);

        Produto produtoDB = dao.buscar("12345");
        assertNotNull(produtoDB);
        assertNotNull(produtoDB.getId());
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        Integer quantDel = dao.deletar(produtoDB);
        assertNotNull(quantDel);
    }

    @Test
    public void atualizarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("12345");
        produto.setNome("Objeto 1");
        Integer quant = dao.registrar(produto);
        assertTrue(quant == 1);

        Produto produtoDB = dao.buscar("12345");
        assertNotNull(produtoDB);
        assertNotNull(produtoDB.getId());
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        produtoDB.setCodigo("67890");
        produtoDB.setNome("Variável 1");
        Integer countUp = dao.atualizar(produtoDB);
        assertTrue(countUp == 1);

        Produto produtoDB1 = dao.buscar("12345");
        assertNull(produtoDB1);

        Produto produtoDB2 = dao.buscar("67890");
        assertNotNull(produtoDB2);
        assertEquals(produtoDB.getId(), produtoDB2.getId());
        assertEquals(produtoDB.getCodigo(), produtoDB2.getCodigo());
        assertEquals(produtoDB.getNome(), produtoDB2.getNome());

        List<Produto> list = dao.buscarTodos();
        for (Produto pro : list) {
            dao.deletar(pro);
        }
    }

    @Test
    public void buscarTodosTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto1 = new Produto();
        produto1.setCodigo("12345");
        produto1.setNome("Objeto 1");
        Integer contReg1 = dao.registrar(produto1);
        assertTrue(contReg1 == 1);

        Produto produto2 = new Produto();
        produto2.setCodigo("67890");
        produto2.setNome("Variável 1");
        Integer contReg2 = dao.registrar(produto2);
        assertTrue(contReg2 == 1);

        List<Produto> list = dao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int contDel = 0;
        for (Produto pro : list) {
            dao.deletar(pro);
            contDel++;
        }
        assertEquals(list.size(), contDel);

        list = dao.buscarTodos();
        assertEquals(list.size(), 0);
    }
}
