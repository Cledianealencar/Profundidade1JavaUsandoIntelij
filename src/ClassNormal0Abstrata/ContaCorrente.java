package ClassNormal0Abstrata;
public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 5.0;
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
            System.out.println("Saque de R$" + valor + " realizado (Taxa de R$5.0 aplicada).");
        } else {
            System.out.println("Saldo insuficiente para saque na Conta Corrente.");
        }
    }
}

