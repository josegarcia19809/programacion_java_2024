package U4_Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
* Esta versión primero se asegura de que exista
* el archivo numbers.txt. Si el archivo no existe
* solo lo indicará y terminará la ejecución
* */
public class SumarValoresArchivo2 {
    public static void main(String[] args) throws IOException {
        double suma = 0.0; // Acumulador, inicializado en 0

        File archivo = new File("numbers.txt");
        // Asegurarse de que el archivo exista
        if (!archivo.exists()) {
            System.out.println("El archivo numbers.txt no existe");
            System.exit(0);
        }

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
