package U4_Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LeerArchivoProductos {
    public static void verificarQueArchivoExista(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            throw new FileNotFoundException("El archivo " + nombreArchivo + " no existe");
        }
    }

    public static void main(String[] args) throws IOException {
        String nombreArchivo = "productos.txt";
        try {
            verificarQueArchivoExista(nombreArchivo);
            // Leer y mostrar contenido
            File archivoProductos = new File(nombreArchivo);
            Scanner lector = new Scanner(archivoProductos);

            System.out.println("Contenido del archivo");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
