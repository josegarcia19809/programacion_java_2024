package ArrayListProgramas;

import java.util.ArrayList;

public class ArrayListAsignaturas {
    public static void main(String[] args) {
        ArrayList<String> listaAsignaturas = new ArrayList<>();
        listaAsignaturas.add("Cálculo");
        listaAsignaturas.add("Programación II");
        listaAsignaturas.add("Estadística");
        listaAsignaturas.add("Sistemas Operativos I");

        // Imprimir los elementos con un for mejorado
        System.out.println("Asignaturas:");
        for (String asignatura: listaAsignaturas){
            System.out.println(asignatura);
        }
        System.out.println("--------------------------");

        // Usar el método toString de ArrayList
        System.out.println(listaAsignaturas.toString());
    }
}
