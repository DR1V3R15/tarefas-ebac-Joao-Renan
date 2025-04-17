package br.com.jrenan.dao.generic.jdbc.dao;

import br.com.jrenan.domain.Cliente;

import java.util.List;

/**
 * @author João Renan
 *
 * Projeto 3 Back-End Java, Ebac
 */

public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente) throws Exception;

    public Cliente consultar(String codigo) throws Exception;

    public Integer excluir(Cliente clienteBD) throws Exception;

    public Integer atualizar(Cliente cliente) throws Exception;

    public List<Cliente> buscarTodos() throws Exception;

}
