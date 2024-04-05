package PromedioClaseArchivo;

import java.io.*;
import java.util.Scanner;

public class LeerCalificacionesArchivo {
    public static void main(String[] args) throws IOException {
        double sumaTotal = 0.0, promedio;
        int contador = 0;

        File archivo = new File("calificaciones_clase.txt");
        Scanner entradaArchivo = new Scanner(archivo);

        System.out.println("Calificaciones");
        while (entradaArchivo.hasNext()) {
            int calificacion = entradaArchivo.nextInt();
            System.out.print(calificacion + " ");
            sumaTotal += calificacion;
            contador++;
        }
        System.out.println();

        if (contador != 0) {
            promedio = sumaTotal / contador;
        } else {
            System.out.println("No hay calificaciones");
            return;
        }
        System.out.println("Suma de todas las calificaciones: " + sumaTotal);
        System.out.println("Cantidad de calificaciones: " + contador);
        System.out.println("Promedio de calificaciones: " + promedio);
    }
}
