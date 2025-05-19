public class MainExercicio3Carrinho {
    public static void main(String[] args) {
        Produto p1 = new Produto("caneta", 2.5);
        Produto p2 = new Produto("lapis");

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
    }
}
