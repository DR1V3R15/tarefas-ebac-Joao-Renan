package test.java.br.com.jrenan.dao;

import main.java.br.com.jrenan.dao.IClienteDAO;
import main.java.br.com.jrenan.domain.Cliente;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDaoMock implements IClienteDAO {
    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
//    @Override
//    public Boolean salvar(Cliente cliente) {
//        return true;
//    }
//
//    @Override
//    public Cliente buscarPorCpf(Long cpf) {
//        Cliente cliente = new Cliente();
//        cliente.setCpf(cpf);
//        return cliente;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//
//    }
}
