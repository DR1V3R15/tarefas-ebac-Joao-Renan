package br.com.jrenan;

import br.com.jrenan.dao.ClienteMapDAO;
import br.com.jrenan.dao.ClienteSetDAO;
import br.com.jrenan.dao.IClienteDAO;
import br.com.jrenan.domain.Cliente;

import javax.swing.*;

/**
 * @author João Renan
 */

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteSetDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar," +
                "3 para exclusão, 4 para atualizar. ou 5 para sair.",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida, digite 1 para cadastro, 2 para consultar," +
                    "3 para excluir, 4 para atualizar. ou 5 para sair.",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente que deseja cadastrar, separados por vírgula" +
                        " conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente para consular: ",
                        "Consultar cadastro", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExcluir(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente que deseja excluir: ",
                        "Excluir cadastro", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente que deseja atualizar, separados por vírgula" +
                        " conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado. " +
                                "\nLembre-se que não é possível atualizar o CPF!",
                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar," +
                    "3 para excluir, 4 para atualizar. ou 5 para sair.",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3],
                dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso!",
                    "Sucesso ao cadastrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Falha ao cadastrar o cliente, cliente já cadastrado!",
                    "Erro ao cadastrar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente encontrado: " + cliente.toString(),
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado.",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showInputDialog(null,
                "Cadastro de Cliente excluído com sucesso.",
                "Exclusão de cadastro", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3],
                dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        iClienteDAO.atualizar(cliente);

        JOptionPane.showMessageDialog(null, "Cadastro de cliente atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void sair() {
        String clientesCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clientesCadastrados += cliente.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null,
                "Clientes cadastrados: " + clientesCadastrados,
                "Até logo!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) ||"2".equals(opcao) || "3".equals(opcao)
                || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}

