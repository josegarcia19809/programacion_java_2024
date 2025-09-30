package p00_fundamentos;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int aprobados = 0;
        int noAprobados = 0;

        while (contador <= 6) {
            System.out.print("Ingrese la calificación del alumno " + contador + ": ");
            double calificacion = entrada.nextDouble();

            if (calificacion >= 6.0) {
                aprobados++;
            } else {
                noAprobados++;
            }

            contador++;
        }

        System.out.println("✅ Aprobados: " + aprobados);
        System.out.println("❌ Reprobados: " + noAprobados);

        entrada.close();
    }
}

