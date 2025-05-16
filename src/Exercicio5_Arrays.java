// exercicio 5 arrays

import java.util.Scanner;

public class Exercicio5_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        System.out.println("Digite 5 numeros para preencher o array:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Voce digitou:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicao " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
