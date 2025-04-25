package p09_agregacion.EscuelaDirector;

import java.util.Scanner;

public class EscuelaPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir los datos del director para que después se pueda crear un
        // objeto de tipo Escuela
        System.out.println("Datos del director");

        System.out.print("Nombre: ");
        String nombreDirector = entrada.nextLine();

        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nivel de estudios: ");
        String nivel = entrada.nextLine();

        System.out.print("Sueldo: ");
        double sueldo = entrada.nextDouble();
        entrada.nextLine();

        Director elDirector = new Director(nombreDirector, edad, nivel, sueldo);
        System.out.println(".".repeat(50));

        System.out.println("Datos de la escuela");
        System.out.print("Nombre: ");
        String nombreEscuela = entrada.nextLine();

        System.out.print("Tipo (privada/pública): ");
        String tipo = entrada.nextLine();

        Escuela miEscuela = new Escuela(nombreEscuela, tipo, elDirector);
        System.out.println(".".repeat(60));

        System.out.println("Datos de la escuela");
        System.out.println(miEscuela.toString());

        System.out.println("Datos del director de esta escuela");
        System.out.println(miEscuela.getDirectorUnico());
    }
}
