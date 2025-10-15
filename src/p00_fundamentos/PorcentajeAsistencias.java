package p00_fundamentos;

import java.util.Scanner;

public class PorcentajeAsistencias {

    public static double calcularPorcentajeAsistencia(int numeroSesiones,
                                                      int asistenciasAlumno) {
        return asistenciasAlumno * 100.0 / numeroSesiones;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Universidad UAEMEX 🐝");

        System.out.print("Dime total de sesiones de clase: ");
        int totalSesiones = entrada.nextInt();
        int asistencias = 0;
        while (asistencias != -1) {
            System.out.print("Dime a cuántas sesiones entró el alumno (-1) para terminar: ");
            asistencias = entrada.nextInt();
            if (asistencias == -1) {
                break;
            }
            double porcentajeDeAsistencias = calcularPorcentajeAsistencia(totalSesiones,
                    asistencias);
            System.out.printf("Porcentaje de asistencias: %.1f%%%n", porcentajeDeAsistencias);
        }
    }
}
