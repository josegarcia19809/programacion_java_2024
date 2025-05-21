package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivoNombresPersonas {
    public static void crearArchivoSiNoExiste(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                // Crear archivo vacío
                PrintWriter nuevoArchivo = new PrintWriter(archivo);
                nuevoArchivo.close();
                System.out.println("Archivo creado");
            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo");
                System.exit(1);
            }
        } else {
            System.out.println("El archivo ya existe");
        }
    }

    public static void main(String[] args) throws IOException {
        String nombreArchivo = "nombres_personas.txt";
        crearArchivoSiNoExiste(nombreArchivo);

        File archivoNombres = new File(nombreArchivo);

        PrintWriter escritor = new PrintWriter(archivoNombres);
        escritor.println("María López");
        escritor.println("Juan Pérez");
        escritor.println("Ana Ramírez");
        escritor.println("Luis Ortega");
        escritor.close();
    }
}
