package p03_metodos;

import java.util.Scanner;

public class MostrandoLongitudCadena {
    public static void mostrarLongitud(String texto) {
        System.out.println("El texto " + texto + " tiene " + texto.length() +
                " caracteres de longitud");
    }

    public static void main(String[] args) {

        mostrarLongitud("Programación");
        String nombre = "José García";
        mostrarLongitud(nombre);

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un mensaje: ");
        String mensaje = entrada.nextLine();
        mostrarLongitud(mensaje);
    }
}
