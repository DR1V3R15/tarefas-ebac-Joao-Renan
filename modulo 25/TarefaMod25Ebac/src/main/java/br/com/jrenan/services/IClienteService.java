package main.java.br.com.jrenan.services;

import main.java.br.com.jrenan.domain.Cliente;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}

