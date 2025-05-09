package p08_objetos.CirculoApp;

import java.util.Scanner;

public class CirculoPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Operaciones con circulo");

        System.out.print("Dame el radio: ");
        double radio = entrada.nextDouble();

        Circulo c1 = new Circulo(radio);
        System.out.println(".".repeat(50));

        System.out.println("Datos");
        System.out.printf("Radio: %.2f%n", c1.obtenerRadio());
        System.out.printf("Área: %.2f%n", c1.obtenerArea());
        System.out.printf("Diametro: %.2f%n", c1.obtenerDiametro());
        System.out.printf("Circunferencia: %.2f%n", c1.obtenerCircunferencia());
    }
}
