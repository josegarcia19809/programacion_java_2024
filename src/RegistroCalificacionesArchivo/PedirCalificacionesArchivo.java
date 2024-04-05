package RegistroCalificacionesArchivo;

import java.io.*;
import java.util.Scanner;

public class PedirCalificacionesArchivo {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        PrintWriter salidaArchivo = new PrintWriter("calificaciones_examenes.txt");

        System.out.print("¿Cuántos estudiantes quieres guardar? ");
        int cantidadEstudiantes = entrada.nextInt();

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("-".repeat(50));
            System.out.println("Ingresa datos del estudiante #" + i + ": ");
            System.out.print("Dame nombre: ");
            String nombre = entrada.next();
            System.out.print("Dame apellido: ");
            String apellido = entrada.next();
            System.out.print("Dame calificación 1: ");
            int calificacion1 = entrada.nextInt();
            System.out.print("Dame calificación 2: ");
            int calificacion2 = entrada.nextInt();
            System.out.print("Dame calificación 3: ");
            int calificacion3 = entrada.nextInt();
            salidaArchivo.printf("%s, %s, %d, %d, %d%n", nombre, apellido,
                    calificacion1, calificacion2, calificacion3);
        }
        salidaArchivo.close();
    }
}
