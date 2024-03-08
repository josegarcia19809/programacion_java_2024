package U4_Archivos;

import java.io.*;

public class EscribirArchivo4Amigos {
    public static void main(String[] args) throws IOException {
        // Abrir el archivo
        PrintWriter salidaArchivo = new PrintWriter("amigos4.txt");
        // Escribir en el archivo
        salidaArchivo.println("Rox");
        salidaArchivo.println("Mary");
        salidaArchivo.println("Isaac");
        salidaArchivo.println("Carolina");
        // Cerrar el archivo
        salidaArchivo.close();

        System.out.println("Amigos grabados en el archivo");
    }
}
