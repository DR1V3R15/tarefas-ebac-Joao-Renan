import java.util.*;

/**
 * @author João Renan
 *
 * Exercício Ebac Módulo 23
 *
 */

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite todos os nomes e sexos separados por traço, e separados por vírgula conforme exemplo: João-M,Vivian-F. ");
        String nomesSexos = s.nextLine();

        Map<String, List<String>> listas = separarHomensEMulheres(nomesSexos);

        List<String> listaDeHomens = listas.get("homens");
        List<String> listaDeMulheres = listas.get("mulheres");

        Collections.sort(listaDeHomens);
        Collections.sort(listaDeMulheres);

        System.out.println("Lista de Homens: " + listaDeHomens);
        System.out.println("Lista de Mulheres: " + listaDeMulheres);
    }

    public static Map<String, List<String>> separarHomensEMulheres(String nomesSexos) {
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
        Map<String, List<String>> listas = new HashMap<>();
        listas.put("homens", listaDeHomens);
        listas.put("mulheres", listaDeMulheres);
        return listas;
    }
}
