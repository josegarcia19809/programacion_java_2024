package p06_arreglos_dos_dimensiones;

import java.util.Scanner;

public class CalificacionesMaterias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int ESTUDIANTES = 2;
        final int MATERIAS = 3;

        int[][] calificaciones = new int[ESTUDIANTES][MATERIAS];
        for (int i = 0; i < ESTUDIANTES; i++) {
            for (int j = 0; j < MATERIAS; j++) {
                System.out.printf("Estudiante %d, calificacion %d: ", (i + 1), (j + 1));
                calificaciones[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < ESTUDIANTES; i++) {
            double total = 0;
            for (int j = 0; j < MATERIAS; j++) {
                total = total + calificaciones[i][j];
            }
            double promedio = total / MATERIAS;
            System.out.println();
            System.out.printf("Promedio del estudiante %d: %.1f", (i + 1), promedio);
        }
    }
}
