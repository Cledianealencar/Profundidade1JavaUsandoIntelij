package Encapsulamento;
// exercicio 1 – cadastro de cliente

public class Cliente {
    private String nome;
    private String email;

    //get
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }

    //set
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setEmail(String novoEmail) {
        email = novoEmail;
    }
}

class mainCliente{
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Diane");
        cliente.setEmail("Diane10@gmail.com");

        System.out.println("cliente: " + cliente.getNome());
        System.out.println("emaiil: " + cliente.getEmail());
    }
}
