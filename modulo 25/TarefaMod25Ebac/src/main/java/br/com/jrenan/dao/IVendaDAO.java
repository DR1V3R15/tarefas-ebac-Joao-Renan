package main.java.br.com.jrenan.dao;

import main.java.br.com.jrenan.dao.generic.IGenericDAO;
import main.java.br.com.jrenan.domain.Venda;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author João Renan
 *
 * Projeto 2 - Modulo 25 Ebac
 *
 */

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
