package ClassNormal0Abstrata;

// Classe abstrata
public abstract class Conta {
    String numeroConta;
    String titular;
    double saldo;

    //construtor
    public Conta(String numeroConta, String titular,double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //abstrato que obriga as subclasses a implementarem
    public abstract void sacar(double valor);

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void exibirDados(){
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}
