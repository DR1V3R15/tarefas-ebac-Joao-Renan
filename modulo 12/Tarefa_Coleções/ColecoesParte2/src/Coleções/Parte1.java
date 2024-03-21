package Coleções;

import java.util.*;

/**
 * @author João Renan
 *
 * Exercício Módulo 11 Ebac - Parte 1
 */

public class Parte1 {
    public static void main(String[] args) {
        listaDePessoas();
    }

    private static void listaDePessoas() {
        System.out.println("*** Lista De Pessoas ***");
        Scanner s = new Scanner(System.in);

        System.out.println("Digite todos os nomes separados por vírgula: ");
        String nomes = s.nextLine();

        List<String> lista = new ArrayList<>(List.of(nomes.split(",")));

        Collections.sort(lista);
        System.out.println(lista);
    }
}
