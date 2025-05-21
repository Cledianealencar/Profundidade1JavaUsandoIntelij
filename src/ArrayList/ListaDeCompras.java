package ArrayList;

import java.util.ArrayList;

public class ListaDeCompras {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("maça");
        lista.add("banana");
        lista.add("chocolate");
        lista.add("morango");
        lista.add("uva");

        System.out.println("\nLista de compras: ");

        for (String item : lista){
            System.out.println("- " + item);
        }

        lista.remove("chocolate");

        System.out.println("\nLista atualizada:");

        for (String item : lista){
            System.out.println("- " + item);
    }
    }
}
