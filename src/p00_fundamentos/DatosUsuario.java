package p00_fundamentos;

import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer desde teclado
        Scanner entrada = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Dame tu nombre: ");
        String nombre = entrada.nextLine();   // cadena

        System.out.print("Dame tu edad: ");
        int edad = entrada.nextInt();         // entero

        System.out.print("¿Cuánto ganas?: ");
        double salario = entrada.nextDouble(); // flotante

        System.out.println();

        // Imprimir resultados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);

        entrada.close(); // cerrar el Scanner
    }
}
