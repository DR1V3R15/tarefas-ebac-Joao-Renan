package CalculoDaMedia;

import java.util.Scanner;

public class ValidaçãoDaMédiaDoAluno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Agora você calculará sua média, coloque sua nota 1: ");
        int nota1 = s.nextInt();
        System.out.print("Ok, agora sua nota 2: ");
        int nota2 = s.nextInt();
        System.out.print("Ok, agora sua nota 3: ");
        int nota3 = s.nextInt();
        System.out.print("Ok, agora sua nota 4: ");
        int nota4 = s.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Sua média é " + media + ". Você está aprovado!");
        } else if (media >= 5) {
            System.out.println("Sua média é " + media + ". Você está de recuperação.");
        } else {
            System.out.println("Sua média é " + media + ". Você está reprovado.");
        }
    }
}