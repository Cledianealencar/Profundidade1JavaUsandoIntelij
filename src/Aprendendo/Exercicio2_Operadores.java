package Aprendendo;// exercicio 2 operadores relacionais e logicos

import java.util.Scanner;

public class Exercicio2_Operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
