package U4_Archivos;

import java.io.*;

public class EscribirArchivoDemo1 {
    public static void main(String[] args) throws IOException {
        // Abrir el archivo
        PrintWriter salidaArchivo = new PrintWriter("salida.txt");
        // Escribir en el archivo
        salidaArchivo.println("Hola, mundo");
        // Cerrar el archivo
        salidaArchivo.close();

        System.out.println("Datos grabados en el archivo");
    }
}
