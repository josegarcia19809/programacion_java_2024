package ArrayListProgramas;

import java.util.ArrayList;

public class ArrayListNombres {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Jaime");
        listaNombres.add("Catalina");
        listaNombres.add("Guillermo");

        System.out.println("El ArrayList tiene " +
                listaNombres.size() +
                " objetos almacenados en él");
        System.out.println("------------------------------");

        System.out.print("Elemento que está en la posición 1: ");
        System.out.println(listaNombres.get(1));
        System.out.println("------------------------------");

        // Mostrar todos los elementos de listaNombres
        System.out.println("Elementos en listaNombres: ");
        for (int index = 0; index < listaNombres.size(); index++) {
            System.out.println(listaNombres.get(index));
        }
    }
}
