package p04_ArrayList;

import java.util.ArrayList;

public class ArrayListCalificaciones {
    public static void main(String[] args) {
        ArrayList<Double> Calificaciones = new ArrayList<>();
        Calificaciones.add(7.1);
        Calificaciones.add(9.3);
        Calificaciones.add(7.9);
        Calificaciones.add(9.4);
        Calificaciones.add(9.8);
        imprimir(Calificaciones);

        Calificaciones.remove(1);
        System.out.println("-".repeat(30));
        imprimir(Calificaciones);
    }

    public static void imprimir(ArrayList<Double> calificaciones) {
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println("[" + i + "]: " +
                    calificaciones.get(i));
        }
    }
}
