package Generics;

/**
 * @author João Renan
 */

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros {

    public static void main(String[] args) {
        Honda honda = new Honda();
        Toyota toyota = new Toyota();
        Mazda mazda = new Mazda();

        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(honda);
        listaDeCarros.add(toyota);
        listaDeCarros.add(mazda);

        System.out.println(listaDeCarros);
    }
}
