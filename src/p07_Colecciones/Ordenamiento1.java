package p07_Colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamiento1 {
    public static void main(String[] args) {
        String[] palos = {"Corazones", "Diamantes",
                "Bastos", "Espadas"};

        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos desordenados:%s%n",
                lista);
        System.out.println("-".repeat(40));

        Collections.sort(lista);
        System.out.printf("Elementos ordenados:%s%n",
                lista);
        System.out.println("-".repeat(40));

        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Elementos ordenados:%s%n",
                lista);
        System.out.println("-".repeat(40));
    }
}
