package Coleções;

import java.util.*;

/**
 * @author João Renan
 *
 * Exercício Módulo 11 Ebac - Parte 2
 */

public class Parte2 {

    public static void main(String[] args) {
        System.out.println("*** Lista De Homens e Mulheres ***");

        Scanner s = new Scanner(System.in);

        System.out.println("Digite todos os nomes e sexos separados por " +
                "traço, e separados por vírgula conforme exemplo: João-M,Vivian-F. ");
        String nomesSexos = s.nextLine();
        List<String> lista = new ArrayList<>(List.of(nomesSexos.split(",")));

        List<String> listaDeHomens = new ArrayList<>();
        List<String> listaDeMulheres = new ArrayList<>();

        for (String string : lista) {
            String[] parts = string.split("-");
            String nome = parts[0];
            String sexo = parts[1];
            if (sexo.equalsIgnoreCase("M")) {
                listaDeHomens.add(nome);
            } else {
                listaDeMulheres.add(nome);
            }
        }
        Collections.sort(listaDeHomens);
        Collections.sort(listaDeMulheres);
        System.out.println("Lista de Homens: " + listaDeHomens);
        System.out.println("Lista de Mulheres: " + listaDeMulheres);
    }
}

