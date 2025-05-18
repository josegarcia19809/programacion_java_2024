package U4_Archivos;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirArchivoFrutas {

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
        Scanner teclado = new Scanner(System.in);
        String nombreArchivo = "frutas.txt";
        crearArchivoSiNoExiste(nombreArchivo);

        File archivoFrutas = new File(nombreArchivo);

        PrintWriter escritor = new PrintWriter(archivoFrutas);
        escritor.println("Manzana");
        escritor.println("Plátano");
        escritor.println("Fresa");
        escritor.println("Sandía");
        escritor.close();
    }
}
