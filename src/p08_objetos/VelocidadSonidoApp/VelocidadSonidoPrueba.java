package p08_objetos.VelocidadSonidoApp;

import java.util.Scanner;

public class VelocidadSonidoPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(".".repeat(100));
        System.out.println("Tiempo que le toma al sonido viajar en diferentes medios");
        System.out.println("Velocidad en el aire: 1100 pies por segundo");
        System.out.println("Velocidad en el agua: 4900 pies por segundo");
        System.out.println("Velocidad en el acero: 16400 pies por segundo");
        System.out.println(".".repeat(100));

        System.out.print("Dame la distancia recorrida en pies: ");
        double distancia = entrada.nextDouble();

        // Crear una instancia
        VelocidadSonido prueba1 = new VelocidadSonido(distancia);

        System.out.println("Tiempos");
        System.out.printf("En aire: %.3f segundos %n", prueba1.calcularTiempoEnAire());
        System.out.printf("En agua: %.3f segundos %n", prueba1.calcularTiempoEnAgua());
        System.out.printf("En acero: %.3f segundos %n", prueba1.calcularTiempoEnAcero());
    }
}
