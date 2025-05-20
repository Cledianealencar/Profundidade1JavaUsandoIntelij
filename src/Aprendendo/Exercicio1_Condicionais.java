package Aprendendo;// exercicio 1 condicionais

import java.util.Scanner;

public class Exercicio1_Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        scanner.close();
    }
}
