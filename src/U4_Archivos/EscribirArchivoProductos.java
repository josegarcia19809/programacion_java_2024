package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivoProductos {
    public static void crearArchivoSiNoExiste(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            try {
                // Crear archivo vacío
                PrintWriter nuevoArchivo = new PrintWriter(archivo);
                nuevoArchivo.close();
                System.out.println("Archivo creado");
            } catch (IOException e) {
                System.err.println("No se pudo crear el archivo");
                System.exit(1);
            }
        } else {
            System.out.println("El archivo ya existe");
        }
    }

    public static void main(String[] args) throws IOException {
        String nombreArchivo = "productos.txt";
        crearArchivoSiNoExiste(nombreArchivo);

        File archivoProductos = new File(nombreArchivo);
        PrintWriter escritor = new PrintWriter(archivoProductos);

        escritor.println("Lápiz, 5.00");
        escritor.println("Cuaderno, 25.50");
        escritor.println("Regla, 10.00");
        escritor.println("Mochila, 350.00");

        escritor.close();
    }

}
