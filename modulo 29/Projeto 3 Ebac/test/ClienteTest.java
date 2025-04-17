import br.com.jrenan.dao.generic.jdbc.dao.ClienteDAO;
import br.com.jrenan.dao.generic.jdbc.dao.IClienteDAO;
import br.com.jrenan.domain.Cliente;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author João Renan
 *
 * Projeto 3 Back-End Java, Ebac
 */

public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("15");
        cliente.setNome("João Renan");
        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar("15");
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void atualizarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("15");
        cliente.setNome("João Renan");
        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar("15");
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setCodigo("10");
        clienteBD.setNome("Variável");
        Integer countUp = dao.atualizar(clienteBD);
        assertTrue(countUp == 1);

        Cliente clienteBD1 = dao.consultar("15");
        assertNull(clienteBD1);

        Cliente clienteBD2 = dao.consultar("10");
        assertNotNull(clienteBD2);
        assertEquals(clienteBD.getId(), clienteBD2.getId());
        assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
        assertEquals(clienteBD.getNome(), clienteBD2.getNome());

        List<Cliente> list = dao.buscarTodos();
        for (Cliente cl : list) {
            dao.excluir(cl);
        }
    }

    @Test
    public void buscarTodosTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente1 = new Cliente();
        cliente1.setCodigo("15");
        cliente1.setNome("João Renan");
        Integer contCad1 = dao.cadastrar(cliente1);
        assertTrue(contCad1 == 1);

        Cliente cliente2 = new Cliente();
        cliente2.setCodigo("10");
        cliente2.setNome("Variável");
        Integer contCad2 = dao.cadastrar(cliente2);
        assertTrue(contCad2 == 1);

        List<Cliente> list = dao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int contDel = 0;
        for (Cliente cl : list) {
            dao.excluir(cl);
            contDel++;
        }
        assertEquals(list.size(), contDel);

        list = dao.buscarTodos();
        assertEquals(list.size(), 0);
    }
}
