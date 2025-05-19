// exercicio 3 - getters e setters
public class Exercicio3GetSet {
    String nome;
    double preco;

    //definir nome
    public void setNome(String nome){
        this.nome = nome;
    }

    //pegar o nome
    public String getNome(){
        return nome;
    }

    //definir o preco com validacao
    public void setPreco( double preco){
        if (preco >= 0 ){
            this.preco = preco;
        }
    }

    //pegar o preco
    public double getPreco() {
        return preco;
    }
}
