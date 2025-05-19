public class Exercicio2Encapsulamento {
    private double saldo;

// metodo para alterar o saldo com validacao
public void setSaldo(double valor) {
    if (valor >= 0) {
        saldo = valor;
    }
}

// metodo para pegar o valor do saldo
public double getSaldo(){
        return saldo;
    }

}
