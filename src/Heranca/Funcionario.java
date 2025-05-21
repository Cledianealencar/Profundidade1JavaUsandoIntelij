package Heranca;

public class Funcionario {
    protected String nome;
    protected double salario;

    //construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //metodo
    public void exibirInformacoes(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario: R$" + salario);
    }

}
