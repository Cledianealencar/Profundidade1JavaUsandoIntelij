package ModificadoresDeAcesso;
//conta bancaria com validacao de saldo

public class Conta {
    private double saldo;

    //get
    public double getSaldo(){
        return saldo;
    }

    //set
    public void setSaldo(double novoSaldo){
        if (novoSaldo >= 0){
            saldo = novoSaldo;
        }else{
            System.out.println("saldo invalido");
        }
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }else{
            System.out.println("valor invalido");
        }
    }
}

class mainConta{
    public static void main(String[] args){
        Conta conta = new Conta();
        conta.setSaldo(300.00);
        conta.depositar(500.99);

        System.out.println("Saldo: " + conta.getSaldo());

    }
}

