package GettersSetters;
//sistema de animal no pet shop

public class Pet {
    private String nome;
    private String tipo;
    private int idade;
//get
    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public int getIdade(){
        return idade;
    }
//set
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public void setTipo(String novoTipo){
        tipo = novoTipo;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }
}

class mainPet{
    public static void main(String[] args) {
        Pet pet = new Pet();

        pet.setNome("Paçoca");
        pet.setTipo("cachorro");
        pet.setIdade(3);

        System.out.println("pet: " + pet.getNome());
        System.out.println("tipo: " + pet.getTipo());
        System.out.println("idade: " + pet.getIdade());
    }
}


