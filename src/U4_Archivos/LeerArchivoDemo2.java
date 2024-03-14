package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeerArchivoDemo2 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        // Obtener el nombre del archivo
        System.out.print("Dame el nombre del archivo: ");
        String nombreArchivo = entrada.nextLine();

        // Abrir el archivo
        File archivo = new File(nombreArchivo);
        Scanner entradaArchivo = new Scanner(archivo);

        // Leer el archivo
        String linea = entradaArchivo.nextLine();
        System.out.println("La primer línea dice: ");
        System.out.println(linea);

        // Cerrar el archivo
        entradaArchivo.close();
    }
}
