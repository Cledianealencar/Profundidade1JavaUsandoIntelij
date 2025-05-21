package Heranca;

public class Gerente extends Funcionario{

    private String departamento;

    //construtor
    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    //metodo
    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }
}