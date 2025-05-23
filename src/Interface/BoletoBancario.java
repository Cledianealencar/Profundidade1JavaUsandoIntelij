package Interface;

public class BoletoBancario implements Pagamento{
    @Override
    public void pagar(){
        System.out.println("Pagamento com boleto realizado.\n");
    }
    @Override
    public void estornar(){
        System.out.println("Estorne com boleto realizado.\n");
    }
}
