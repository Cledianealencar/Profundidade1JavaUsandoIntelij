package ArrayList;

import java.util.ArrayList;

public class CadastroDeAlunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Diane");
        alunos.add("Carlos");
        alunos.add("Mathias");
        alunos.add("Ana");
        alunos.add("Julio");

        System.out.println("Alunos:");

        for (String aluno : alunos){
            System.out.println("- " + aluno);
        }

        String buscaAluno = "Diane";

        if (alunos.contains(buscaAluno)){
            System.out.println("\n" + buscaAluno + " encontrado!");
        }else {
            System.out.println("\n" + buscaAluno + " não foi encontrado!" );
        }
    }
}
