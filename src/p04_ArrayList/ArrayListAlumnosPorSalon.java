package p04_ArrayList;

// Se quiere guardar una lista de alumnos
// por semestre, es decir, la cantidad de alumnos
// que hay por salón
// Primer semestre: 34
// Tercer semestre: 45
// Quinto semestre: 23
// Séptimo semestre: 27
// Noveno semestre: 20

import java.util.ArrayList;

public class ArrayListAlumnosPorSalon {
    public static void main(String[] args) {

        ArrayList<Integer> listaCantidadAlumnos = new ArrayList<>();
        listaCantidadAlumnos.add(34);
        listaCantidadAlumnos.add(23);
        listaCantidadAlumnos.add(27);
        listaCantidadAlumnos.add(20);
        imprimir(listaCantidadAlumnos);
        listaCantidadAlumnos.add(1, 45);

        imprimir(listaCantidadAlumnos);

        listaCantidadAlumnos.set(0, 44);
        listaCantidadAlumnos.set(1, listaCantidadAlumnos.get(1) + 10);
        listaCantidadAlumnos.set(2, listaCantidadAlumnos.get(2) + 10);
        listaCantidadAlumnos.set(3, listaCantidadAlumnos.get(3) + 10);
        listaCantidadAlumnos.set(4, listaCantidadAlumnos.get(4) + 10);
        imprimir(listaCantidadAlumnos);

        for (int i = 0; i < listaCantidadAlumnos.size(); i++) {
            int alumnos = listaCantidadAlumnos.get(i);
            alumnos += 10;
            listaCantidadAlumnos.set(i, alumnos);
        }
        imprimir(listaCantidadAlumnos);
    }

    public static void imprimir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "]:" +
                    lista.get(i));
        }
        System.out.println("-".repeat(30));
    }
}
