package U4_Archivos;


import java.io.*;
import java.util.Scanner;

public class EscribirArchivoDemo3 {
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

        // Asegurarse de que el archivo no exista
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            System.out.println("El archivo " + nombreArchivo
                    + " ya existe");
            System.exit(0);
        }

        PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
        for (int i = 1; i <= numAmigos; i++) {
            System.out.print("Introduce el nombre del amigo " +
                    "número " + i + ": ");
            nombreAmigo = entrada.nextLine();
            salidaArchivo.println(nombreAmigo);
        }
        salidaArchivo.close();
        System.out.println("Datos grabados en el archivo.");

    }
}

