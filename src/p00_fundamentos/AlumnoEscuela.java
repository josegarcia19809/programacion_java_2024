package p00_fundamentos;

import java.util.Scanner;

public class AlumnoEscuela {

    public static void estaAprobado() {
        System.out.println("Felicidades🥳, ya aprobaste ");
    }

    public static void noEstaAprobado() {
        System.out.println("Ni modo😭, no aprobaste");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de calificaciones 💯");

        System.out.print("Dame tu calificación: ");
        int calificacion = entrada.nextInt();

        System.out.print("Dame tu porcentaje de asistencias: ");
        int porcentaje = entrada.nextInt();

        if (calificacion >= 70 && porcentaje >= 80) {
            estaAprobado();
        } else {
            noEstaAprobado();
        }
    }
}
