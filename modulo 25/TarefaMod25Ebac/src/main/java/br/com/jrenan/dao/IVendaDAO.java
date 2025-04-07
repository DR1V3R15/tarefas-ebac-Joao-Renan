package main.java.br.com.jrenan.dao;

import main.java.br.com.jrenan.dao.generic.IGenericDAO;
import main.java.br.com.jrenan.domain.Venda;
import main.java.br.com.jrenan.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
