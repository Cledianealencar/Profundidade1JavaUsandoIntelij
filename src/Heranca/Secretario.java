package Heranca;

public class Secretario extends Funcionario {
    //metodo
    public Secretario(String nome, double salario){
        super(nome, salario);
    }

    //metodo

    @Override
    public void exibirInformacoes() {
        System.out.println("Secretario: " + nome);
        System.out.println("Salario: R$ " + salario);
    }
}
