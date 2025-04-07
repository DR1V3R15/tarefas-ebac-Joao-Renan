package main.java.br.com.jrenan.dao;

import main.java.br.com.jrenan.dao.generic.GenericDAO;
import main.java.br.com.jrenan.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEndereço(entity.getEndereço());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTelefone(entity.getTelefone());
    }
//    @Override
//    public Boolean salvar(Cliente cliente) {
//        return true;
//    }
//
//    @Override
//    public Cliente buscarPorCpf(Long cpf) {
//        return null;
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
