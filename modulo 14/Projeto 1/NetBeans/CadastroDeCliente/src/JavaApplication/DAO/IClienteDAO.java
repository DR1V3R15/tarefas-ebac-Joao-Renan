package JavaApplication.DAO;

/**
 *
 * @author João Renan
 */
import JavaApplication.DOMAIN.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void atualizar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
