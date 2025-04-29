package p03_metodos;

import java.util.Scanner;

public class AsistenciasAlumno {
    public static double calcularPorcentajeAsistencia(int numeroSesiones,
                                                      int asistenciasAlumno) {
        double porcentaje = (asistenciasAlumno * 100.0) / numeroSesiones;
        return porcentaje;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Sistema de asistencias");

        System.out.print("Dame número de sesiones: ");
        int sesiones = entrada.nextInt();

        System.out.print("Dime las asistencias del alumno: ");
        int asistencias = entrada.nextInt();

        double porcentajeAsistencias = calcularPorcentajeAsistencia(sesiones, asistencias);

        System.out.println("Porcentaje de asistencias " + porcentajeAsistencias);

        if (porcentajeAsistencias >= 80) {
            System.out.println("Puede presentar examen");
        } else {
            System.out.println("No puede presentar examen");
        }
    }
}
