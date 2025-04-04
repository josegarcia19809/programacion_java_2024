package p08_objetos.AeropuertoApp;

import java.util.Scanner;

public class AeropuertoPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aeropuerto ait = new Aeropuerto();

        System.out.print("Dame nombre del aeropuerto: ");
        String nombreAeropuerto = entrada.nextLine();

        ait.establecerNombre(nombreAeropuerto);
        System.out.println("El nombre del aeropuerto es " + ait.obtenerNombre());
        System.out.println("-".repeat(100));
    }
}
