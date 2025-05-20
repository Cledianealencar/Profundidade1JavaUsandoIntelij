package Aprendendo;

public class MainExercicio3 {
    public static void main(String[] args){
        Exercicio3GetSet p = new Exercicio3GetSet();

        //define set
        p.setNome("Jaqueta");
        p.setPreco(16.99);

        //pega get
        System.out.println("Aprendendo.Produto: " + p.getNome() + " preço: " + p.getPreco() );
    }
}
