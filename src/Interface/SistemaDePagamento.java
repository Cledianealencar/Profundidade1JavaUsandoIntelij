package Interface;

public class SistemaDePagamento {
    public static void main(String[] args) {

        //Pagamnt com cartão
        Pagamento cartao = new CartaoCredito();
        cartao.pagar();
        cartao.estornar();

        System.out.println("---");

        //Pagamnt com boleto
        Pagamento boleto = new BoletoBancario();
        boleto.pagar();
        boleto.estornar();
    }
}

