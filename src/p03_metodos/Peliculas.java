package p03_metodos;

import java.util.Scanner;

public class Peliculas {
    public static void mostrarPelicula(String pelicula) {
        System.out.println("Tu película es " + pelicula);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el nombre de una película: ");
        String nombrePelicula = entrada.nextLine();

        mostrarPelicula(nombrePelicula);
    }
}
