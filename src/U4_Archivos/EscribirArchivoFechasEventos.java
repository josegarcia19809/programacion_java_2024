package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivoFechasEventos {
    public static void crearArchivoSiNoExiste(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                // Crear el archivo vacío
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
        String nombreArchivo = "eventos.txt";
        crearArchivoSiNoExiste(nombreArchivo);

        File archivoEventos = new File(nombreArchivo);

        PrintWriter escritor = new PrintWriter(archivoEventos);
        escritor.println("2025-06-01, Examen final");
        escritor.println("2025-06-10, Entrega de proyecto");
        escritor.println("2025-06-15, Vacaciones");

        escritor.close();
    }
}
