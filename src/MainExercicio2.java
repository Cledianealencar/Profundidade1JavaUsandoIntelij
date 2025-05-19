public class MainExercicio2 {
    public static void main(String[] args){
    //cria uma conta
        Exercicio2Encapsulamento conta = new Exercicio2Encapsulamento();

    // define o saldo com set
        conta.setSaldo(1500.00);

    // mostra o saldo com get
    System.out.print("saldo da sua conta : R$ " + conta.getSaldo());
    }
}
