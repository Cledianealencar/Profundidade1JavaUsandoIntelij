package Construtores;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, String titular, double inicialSaldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = inicialSaldo;
    }

    //getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Deposita valor
    public boolean depositar(double valor) {
        if (valor <= 0) return false;
        saldo += valor;
        return true;
    }

    // Saca valor
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) return false;
        saldo -= valor; //saldo = saldo - valor
        return true;
    }

    // Mostra as informações da conta
    @Override //Estou reescrevendo um método que já existe na classe pai (superclasse)
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
