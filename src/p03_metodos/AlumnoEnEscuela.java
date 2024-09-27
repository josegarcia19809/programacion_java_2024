package p03_metodos;

import java.util.Scanner;

/*
 * Este programa preguntará a un alumno su calificación (0 y 100), también pedirá su
 * porcentaje de asistencias
 * El programa tendrá 2 métodos:
 * estaAprobado(): mostrará un mensaje de que está aprobado
 * noEstaAprobado(): mostrará un mensaje de que no está aprobado
 * Condición para que esté aprobado: 70 o más de calificación y que tenga por lo
 * menos 80% de asistencias
 * */
public class AlumnoEnEscuela {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de calificaciones");

        System.out.println("Dame tu calificación: ");
        int calificacion = entrada.nextInt();

        System.out.println("Dame tu porcentaje de asistencias: ");
        int porcentaje = entrada.nextInt();

        if (calificacion >= 70 && porcentaje >= 80) {
            estaAprobado();
        } else {
            noEstaAprobado();
        }
    }

    public static void estaAprobado() {
        System.out.println("Felicidades 😄, ya aprobaste");
    }

    public static void noEstaAprobado() {
        System.out.println("Ni modo 😭, no aprobaste");
    }
}
