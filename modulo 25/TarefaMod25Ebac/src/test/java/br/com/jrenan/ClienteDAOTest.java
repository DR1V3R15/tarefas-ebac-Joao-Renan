package test.java.br.com.jrenan;

import main.java.br.com.jrenan.dao.IClienteDAO;
import main.java.br.com.jrenan.domain.Cliente;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.jrenan.dao.ClienteDaoMock;

/**
 * @author João Renan
 *
 * Projeto 2 - Modulo 25 Ebac
 *
 */

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setNome("João");
        cliente.setCpf(12345678900L);
        cliente.setCidade("Indaiatuba");
        cliente.setEstado("São Paulo");
        cliente.setEndereço("Endereço");
        cliente.setNumero(123);
        cliente.setTelefone(19123456789L);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);

    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());

    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("João Renan");
        clienteDao.alterar(cliente);
    }
}
