package U4_Archivos;

import java.io.*;
import java.util.Scanner;

public class EscribirArchivoDemo2 {
    public static void main(String[] args) throws IOException {
        String nombreArchivo;
        String nombreAmigo;
        int numAmigos;

        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos amigos tienes? ");
        numAmigos = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Introduce el nombre del archivo: ");
        nombreArchivo = entrada.nextLine();

        PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
        for (int i = 1; i <= numAmigos ; i++) {
            System.out.print("Introduce el nombre del amigo "+
                    "número "+ i+": ");
            nombreAmigo= entrada.nextLine();
            salidaArchivo.println(nombreAmigo);
        }
        salidaArchivo.close();
        System.out.println("Datos grabados en el archivo.");

    }
}
