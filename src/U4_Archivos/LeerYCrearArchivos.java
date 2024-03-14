package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerYCrearArchivos {
    public static void main(String[] args) throws IOException {
        // Abrir el archivo
        File archivo = new File("mis_archivos.txt");
        Scanner entradaArchivo = new Scanner(archivo);

        // Lee cada línea del archivo hasta que ya no encuentra ninguna
        while (entradaArchivo.hasNext()) {
            String nombreArchivo = entradaArchivo.nextLine();
            System.out.println(nombreArchivo);
            PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
            // Cerrar el archivo
            salidaArchivo.close();
        }

        entradaArchivo.close();
    }
}
