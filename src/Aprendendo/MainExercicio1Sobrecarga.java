package Aprendendo;

public class MainExercicio1Sobrecarga {
    public static void main(String[] args) {
        Exercicio1Sobrecarga calc = new Exercicio1Sobrecarga();

        System.out.println(calc.Somar(5,5));
        System.out.println(calc.Somar(2, 2, 6));
        System.out.println(calc.Somar(2.5, 7.5));
    }
}
