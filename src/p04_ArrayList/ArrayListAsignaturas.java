package p04_ArrayList;

import java.util.ArrayList;

public class ArrayListAsignaturas {
    public static void main(String[] args) {
        ArrayList<String> asignaturas = new ArrayList<>();
        asignaturas.add("Español");
        asignaturas.add("Matematicas");
        asignaturas.add("Ciencias");
        asignaturas.add("Costos");
        asignaturas.add("Electronica");

        for (String asignatura : asignaturas) {
            System.out.println(asignatura);
        }

        System.out.println("-".repeat(30));
        System.out.println(asignaturas);
    }
}
