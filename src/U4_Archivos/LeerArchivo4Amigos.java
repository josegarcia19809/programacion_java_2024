package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeerArchivo4Amigos {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        // Obtener el nombre del archivo
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = entrada.nextLine();

        // Abrir el archivo
        File archivo = new File(nombreArchivo);
        Scanner entradaArchivo = new Scanner(archivo);

        // Lee cada línea del archivo hasta que ya no encuentra ninguna
        while (entradaArchivo.hasNext()) {
            String nombreAmigo = entradaArchivo.nextLine();
            System.out.println(nombreAmigo);
        }

        entradaArchivo.close();
    }
}
