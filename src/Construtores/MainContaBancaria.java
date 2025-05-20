package Construtores;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("1234567-84"," Diane", 255.28);

        System.out.println("Comta:");

        //deposito
        conta.depositar(500.00);
        System.out.println("Deposito recebidp = Saldo: " + conta.getSaldo());

        // Tenta sacar mais do que tem no saldo
        boolean saque = conta.sacar(2000.00);
        System.out.println("Tentativa de saque maior que saldo: " + (saque ? "Sucesso" : "Falhou"));

        // Saque válido
        saque = conta.sacar(300.00);
        System.out.println("Saque de 300: " + (saque ? "Sucesso" : "Falhou"));

        //sakdo final
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
