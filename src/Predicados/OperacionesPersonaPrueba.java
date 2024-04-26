package Predicados;

import java.util.ArrayList;

public class OperacionesPersonaPrueba {
    public static void main(String[] args) {
        OperacionesPersona operaciones = new OperacionesPersona();

        System.out.println("Todas las personas");
        imprimirLista(operaciones.getPersonas());

        System.out.println("Apellidos de todos los 'Armando'");
        System.out.printf("%15s%n", "Apellidos");
        imprimirSublista(operaciones.obtenerApellidoPersonasArmando());

        System.out.println("Apellidos de todos los 'Luis'");
        System.out.printf("%15s%n", "Apellidos");
        imprimirSublista(operaciones.obtenerApellidoPersonasLuis());

        System.out.println("-".repeat(100));
        System.out.println("Todas las personas mayores de 18 años y menores de 30");
        imprimirLista(operaciones.obtenerEntre19Y29());

        System.out.println("Todas las personas mayores de 65 años o menores de 30");
        imprimirLista(operaciones.obtenerMayor65Menor30());

        System.out.println("Todas las personas no mayores de 40 años");
        imprimirLista(operaciones.obtenerNoMayor40());
    }

    public static void imprimirLista(ArrayList<Persona> personas) {
        System.out.printf("%15s%15s%5s%n", "Nombre", "Apellidos", "Edad");
        System.out.println("-".repeat(40));
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        System.out.println();
    }

    // Se ocupa para imprimir solo algunos campos
    public static void imprimirSublista(ArrayList<String> sublistaPersonas) {
        for (String persona : sublistaPersonas) {
            System.out.println(persona);
        }
        System.out.println();
    }
}
