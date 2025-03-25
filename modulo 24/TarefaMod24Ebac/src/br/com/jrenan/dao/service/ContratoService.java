package br.com.jrenan.dao.service;

import br.com.jrenan.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
    /**
     * @author João Renan
     *
     * Exercício Ebac Módulo 24
     *
     */
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso";
    }
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso";
    }
}