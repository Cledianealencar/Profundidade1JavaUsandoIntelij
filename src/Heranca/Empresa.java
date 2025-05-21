package Heranca;

public class Empresa {
    public static void main(String[] args) {

        //objetos
        Gerente gerente = new Gerente("Diane",5000, "negocio");
        Recrutador recrutador = new Recrutador("Maria", 1500,3000);
        Secretario secretario = new Secretario("Ana", 2500);

        //polimorfismo
        Funcionario[] funcionarios = {gerente, recrutador, secretario};

        //exibir informacoes
        for (Funcionario f : funcionarios) {
            f.exibirInformacoes();
            System.out.println();
        }
    }
}