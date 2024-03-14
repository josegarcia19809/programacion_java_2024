package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeerArchivoDemo1 {
    public static void main(String[] args) throws IOException {
        // Abrir el archivo
        File archivo = new File("hola.txt");
        Scanner entradaArchivo = new Scanner(archivo);

        // Leer el archivo
        String linea = entradaArchivo.nextLine();
        System.out.println("La primer línea dice: ");
        System.out.println(linea);

        // Cerrar el archivo
        entradaArchivo.close();
    }
}
