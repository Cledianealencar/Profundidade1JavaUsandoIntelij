package Array;

public class ControleDeNotas {
    public static void main(String[] args) {
        double[] notas = {6.0, 7.0, 8.0, 9.0, 5.0};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);
    }
}
