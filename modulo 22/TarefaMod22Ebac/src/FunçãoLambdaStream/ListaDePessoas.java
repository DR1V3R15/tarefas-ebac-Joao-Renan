package FunçãoLambdaStream;

import java.util.*;
import java.util.stream.Collectors;

public class ListaDePessoas {

    public static void main(String[] args) {

        System.out.println("*** Lista De Pessoas ***");

        Scanner s = new Scanner(System.in);

        System.out.println("Digite todos os nomes e sexos separados por " +
                "traço, e separados por vírgula conforme exemplo: João-M,Vivian-F. ");
        String nomesSexos = s.nextLine();
        List<String> listaDePessoas = new ArrayList<>(List.of(nomesSexos.split(",")));

        List<Pessoa> todasAsPessoas = new ArrayList<>();
        for (String string : listaDePessoas) {
            String[] parts = string.split("-");
            String nome = parts[0];
            String sexo = parts[1];
            todasAsPessoas.add(new Pessoa(nome, sexo));
        }

        List<Pessoa> listaDeMulheres = todasAsPessoas.stream()
                .filter(pessoa -> "F".equalsIgnoreCase(pessoa.getSexo()))
                .collect(Collectors.toList());

        listaDeMulheres.sort(Comparator.comparing(Pessoa::getNome));

        System.out.println("Lista de todas as pessoas: " + listaDePessoas);
        System.out.println("Lista com apenas as mulheres: " + listaDeMulheres);
    }
}
