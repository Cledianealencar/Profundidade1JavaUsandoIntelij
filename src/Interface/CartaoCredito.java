package Interface;

public class CartaoCredito implements Pagamento {

    @Override
    public void pagar() {
        System.out.println(" Pagamento com cartão realizado.");
    }

    @Override
    public void estornar() {
        System.out.println("️Estorne com cartão estornado.");
    }
}

