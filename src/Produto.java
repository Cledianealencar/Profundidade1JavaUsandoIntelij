// exercicio 3 – sobrecarga com composicao
public class Produto {
    String nome;
    double preco;

    // construtor que recebe nome e preco
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // construtor que recebe so o nome
    Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }
}
