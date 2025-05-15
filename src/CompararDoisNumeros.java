import java.util.Scanner;

public class CompararDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        sc.close();
    }
}

