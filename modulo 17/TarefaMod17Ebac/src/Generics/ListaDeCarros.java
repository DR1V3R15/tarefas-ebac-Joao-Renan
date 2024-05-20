package Generics;

/**
 * @author João Renan
 */

import java.util.ArrayList;
import java.util.List;

public abstract class ListaDeCarros {

    public static void main(String[] args) {
        Honda honda = new Honda();
        Toyota toyota = new Toyota();
        Mazda mazda = new Mazda();

        List<String> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(honda.toString());
        listaDeCarros.add(toyota.toString());
        listaDeCarros.add(mazda.toString());

        System.out.println(listaDeCarros);
    }
}
