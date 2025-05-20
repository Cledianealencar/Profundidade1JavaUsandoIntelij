package Aprendendo;// exercicio 1 - construtor

public class Exercicio1Construtor {
    String nome;
    int idade;

    public Exercicio1Construtor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Oi, eu sou " + nome + " e tenho " + idade + " anos.");
    }
}
