// exercicio 6 metodos

import java.util.Scanner;

public class Exercicio6_Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Soma de dois numeros usando metodo:");

        System.out.print("Digite o primeiro numero: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = scanner.nextInt();

        int resultado = somar(a, b);
        System.out.println("Resultado da soma: " + resultado);

        scanner.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}
