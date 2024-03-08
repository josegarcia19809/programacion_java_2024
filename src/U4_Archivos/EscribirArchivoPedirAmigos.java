package U4_Archivos;

import java.io.*;
import java.util.Scanner;

public class EscribirArchivoPedirAmigos {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos amigos tienes? ");
        int amigos = entrada.nextInt();

        // Abrir el archivo
        PrintWriter salidaArchivo = new PrintWriter("amigos_lista.txt");
        for (int i = 0; i < amigos; i++) {
            System.out.print("Dime el nombre de tu amigo: ");
            String nombre = entrada.next();
            // Escribir en el archivo
            salidaArchivo.println(nombre);
        }

        // Cerrar el archivo
        salidaArchivo.close();

        System.out.println("Lista de amigos grabada en el archivo");
    }
}
