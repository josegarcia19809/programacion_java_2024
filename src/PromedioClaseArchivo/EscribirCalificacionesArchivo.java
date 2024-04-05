package PromedioClaseArchivo;

import java.io.*;
import java.util.Scanner;

public class EscribirCalificacionesArchivo {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        PrintWriter salidaArchivo = new PrintWriter("calificaciones_clase.txt");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingresa calificación #" + i + ": ");
            int calificacion = entrada.nextInt();
            salidaArchivo.println(calificacion);
        }
        salidaArchivo.close();
        System.out.println("Datos almacenados");

    }
}
