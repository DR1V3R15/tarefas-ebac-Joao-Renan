package br.com.jrenan.dao;

import br.com.jrenan.domain.Cliente;

import java.util.Collection;

/**
 * @author João Renan
 */

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void atualizar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
