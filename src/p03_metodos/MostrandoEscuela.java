package p03_metodos;

import java.util.Scanner;

public class MostrandoEscuela {
    public static void mostrarEscuela(String escuela) {
        System.out.println("Estás estudiando en " + escuela);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dime el nombre de tu escuela: ");
        String nombreEscuela = entrada.nextLine();

        mostrarEscuela(nombreEscuela);
    }
}
