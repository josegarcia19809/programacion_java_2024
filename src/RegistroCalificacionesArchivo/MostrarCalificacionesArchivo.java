package RegistroCalificacionesArchivo;

import java.io.*;
import java.util.Scanner;

public class MostrarCalificacionesArchivo {
    public static void main(String[] args) throws IOException {
        File archivo = new File("calificaciones_examenes.txt");
        Scanner entradaArchivo = new Scanner(archivo);

        System.out.printf("%-15s%-15s%4s%4s%4s%n", "Nombre", "Apellido", "1C", "2C", "3C");
        System.out.println("-".repeat(50));
        while (entradaArchivo.hasNext()) {
            String registro = entradaArchivo.nextLine();
            String[] estudiantes = registro.split(", ");

            String nombre = estudiantes[0];
            String apellido = estudiantes[1];
            int calificacion1 = Integer.parseInt(estudiantes[2]);
            int calificacion2 = Integer.parseInt(estudiantes[3]);
            int calificacion3 = Integer.parseInt(estudiantes[4]);

            System.out.printf("%-15s%-15s%4d%4d%4d%n", nombre, apellido, calificacion1,
                    calificacion2, calificacion3);
        }
        entradaArchivo.close();
    }
}
