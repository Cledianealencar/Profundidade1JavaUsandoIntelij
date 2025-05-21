package ClassNormal0Abstrata;

public class Banco {
    public static void main(String[] args) {

        // Criando uma Conta Corrente
        ContaCorrente cc = new ContaCorrente("12345-0", "Maria", 1000.0);

        // Criando uma Conta Poupança
        ContaPoupanca cp = new ContaPoupanca("54321-0", "João", 500.0);

        // Testando operações na Conta Corrente
        cc.exibirDados();
        cc.sacar(200);
        cc.depositar(100);
        cc.exibirDados();

        System.out.println(); // quebra de linha

        // Testando operações na Conta Poupança
        cp.exibirDados();
        cp.sacar(600); // tentar sacar mais que o saldo
        cp.sacar(400); // saque válido
        cp.depositar(200);
        cp.exibirDados();
    }
}

