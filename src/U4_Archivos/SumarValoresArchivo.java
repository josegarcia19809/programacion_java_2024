package U4_Archivos;

import java.util.Scanner;
import java.io.*;

public class SumarValoresArchivo {
    public static void main(String[] args) throws IOException {
        double suma = 0.0; // Acumulador, inicializado en 0

        File archivo = new File("numbers.txt");
        Scanner entradaArchivo = new Scanner(archivo);

        // Lee todos los valores del archivo y los añade a suma
        while (entradaArchivo.hasNext()) {
            double numero = entradaArchivo.nextDouble();
            suma = suma + numero;
        }
        entradaArchivo.close();
        System.out.println("La suma de los números del archivo " +
                "numbers.txt es " + suma);
    }
}
