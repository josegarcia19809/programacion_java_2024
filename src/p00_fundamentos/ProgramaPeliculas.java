package p00_fundamentos;

import java.util.Scanner;

public class ProgramaPeliculas {
    public static void mostrarPelicula(String pelicula, int calificacion, int anioEstreno) {

        System.out.println("🎥Película: " + pelicula);
        System.out.println("📆Año de estreno: " + anioEstreno);

        if (calificacion >= 9) {
            System.out.println("🎉 Una obra maestra, no te la puedes perder 👍🏼");
        } else if (calificacion >= 7) {
            System.out.println("🍿 Muy buena película, no te la puedes perder");
        } else if (calificacion >= 5) {
            System.out.println("🎭 Aceptable, aunque pudo ser mejor.");
        } else {
            System.out.println("😥 Mmm... quizás te guste otra opción.");
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el nombre de una película: ");
        String nombrePelicula = entrada.nextLine();

        System.out.print("¿Qué calificación le das? (1-10): ");
        int calificacion = entrada.nextInt();

        System.out.print("¿En qué año se estrenó la película? ");
        int anio = entrada.nextInt();

        mostrarPelicula(nombrePelicula, calificacion, anio);
    }
}
