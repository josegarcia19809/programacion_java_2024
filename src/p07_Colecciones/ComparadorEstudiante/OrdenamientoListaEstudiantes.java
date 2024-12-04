package p07_Colecciones.ComparadorEstudiante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenamientoListaEstudiantes {
    public static void imprimirLista(List<Estudiante> estudiantes) {
        estudiantes.forEach(estudiante -> System.out.println(estudiante));
        System.out.println("-".repeat(40));
    }

    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Bruce", "Banner", 8.5f));
        estudiantes.add(new Estudiante("Tony", "Stark", 10.0f));
        estudiantes.add(new Estudiante("Steve", "Rogers", 6.8f));
        estudiantes.add(new Estudiante("Wanda", "Maximoff", 7.8f));
        estudiantes.add(new Estudiante("Peter", "Parker", 9.9f));

        System.out.println("Desordenados");
        imprimirLista(estudiantes);

        System.out.println("Ordenar por calificación");
        Collections.sort(estudiantes, new ComparadorCalificacion());
        imprimirLista(estudiantes);

        System.out.println("Ordenar por apellido");
        estudiantes.sort(new ComparadorApellido());
        imprimirLista(estudiantes);
    }
}
