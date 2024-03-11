package Conversão;

/**
 * @author João Renan
 *
 * Exercício Módulo 9 da Ebac
 */

public class Conversão {

    private static int médio = 32;

    private static long grande = médio * 2;

    private static short pequeno = 16;

    private static byte pequeniníssimo = (byte) pequeno;

    public static void testeDeConversão() {

        System.out.println(médio);
        System.out.println(grande);
        System.out.println(pequeno);
        System.out.println(pequeniníssimo);
    }

    public static void main(String args[]) {

        testeDeConversão();
    }
}
