package test.java.br.com.jrenan;

import main.java.br.com.jrenan.dao.IClienteDAO;
import main.java.br.com.jrenan.domain.Cliente;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.jrenan.services.ClienteService;
import main.java.br.com.jrenan.services.IClienteService;
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

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("João");
        cliente.setCpf(12345678900L);
        cliente.setCidade("Indaiatuba");
        cliente.setEstado("São Paulo");
        cliente.setEndereço("Endereço");
        cliente.setNumero(123);
        cliente.setTelefone(19123456789L);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());

    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("João Renan");
        clienteService.alterar(cliente);

        Assert.assertEquals("João Renan", cliente.getNome());
    }
}
