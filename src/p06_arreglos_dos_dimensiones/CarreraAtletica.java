package p06_arreglos_dos_dimensiones;

import java.util.Scanner;

public class CarreraAtletica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int CORREDORES = 3;
        final int CARRERAS = 2;
        double[][] tiempos = new double[CORREDORES][CARRERAS];

        // Pedir los tiempos
        System.out.println("Registro de tiempos de varios corredores en varias carreras");
        for (int i = 0; i < CORREDORES; i++) {
            for (int j = 0; j < CARRERAS; j++) {
                System.out.printf("Dame tiempo del corredor %d en la carrera %d: ",
                        (i + 1), (j + 1));
                tiempos[i][j] = entrada.nextDouble();
            }
            System.out.println();
        }

        // Calcular los promedios de cada corredor
        for (int i = 0; i < CORREDORES; i++) {
            double total = 0;
            for (int j = 0; j < CARRERAS; j++) {
                total = total + tiempos[i][j];
            }
            double promedio = total / CARRERAS;
            System.out.printf("Promedio del corredor %d: %.2f%n", (i + 1), promedio);
        }

    }
}
