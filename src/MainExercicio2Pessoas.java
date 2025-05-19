public class MainExercicio2Pessoas {
    public static void main(String[] args) {
        Pessoas p = new Pessoas();
        Endereco end = new Endereco();

        p.nome = "diane";
        end.estado = "MG";
        end.cidade = "florida";
        end.rua = "miguel Soares";

        p.endereco = end;

        System.out.println("pessoa: " + p.nome);
        System.out.println("estado: " + p.endereco.estado);
        System.out.println("cidade: " + p.endereco.cidade);
        System.out.println("rua: " + p.endereco.rua);
    }
}
