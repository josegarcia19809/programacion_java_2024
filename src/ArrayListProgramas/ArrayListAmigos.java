package ArrayListProgramas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAmigos {
    public static void main(String[] args) throws IOException {
        // Crear el ArrayList amigos
        ArrayList<String> amigos = new ArrayList<>();

        // Abrir el archivo
        String nombreArchivo = "amigos4.txt";
        File archivo = new File(nombreArchivo);
        Scanner entradaArchivo = new Scanner(archivo);

        // Leer el archivo, por cada elemento leído agregarlo al ArrayList
        while (entradaArchivo.hasNext()) {
            String nombreAmigo = entradaArchivo.nextLine();
            amigos.add(nombreAmigo);
        }

        // cerrar el archivo
        entradaArchivo.close();

        // Imprimir el ArrayList en pantalla
        System.out.println("Lista de amigos: ");
        for (String amigo : amigos) {
            System.out.println(amigo);
        }
    }
}
