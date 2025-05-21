package Heranca;

public class Recrutador extends Funcionario{
    private double comissao;

    //construtor
    public Recrutador(String nome, double salario, double comissao){
        super(nome, salario);
        this.comissao = comissao;
    }

    //metodo
    @Override
    public void exibirInformacoes(){
        System.out.println("Recrutador: " + nome);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Comissao: R$ " + comissao);
        System.out.println("Valor total: R$ " + (comissao + salario));
    }
}
