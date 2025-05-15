import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("digite 1 numero");
            int Num1 = sc.nextInt();

            System.out.print("digite outro");
            int Num2 = sc.nextInt();

            int Soma = Num1 + Num2;

            System.out.println("A soma é "+ Soma);

        sc.close();
    }
}

