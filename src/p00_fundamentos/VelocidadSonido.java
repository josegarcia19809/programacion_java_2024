package p01_fundamentos;

import java.util.Scanner;

public class VelocidadSonido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Velocidad del sonido");
        System.out.println("1.- Aire");
        System.out.println("2.- Agua");
        System.out.println("3.- Acero");
        System.out.println("4.- Salir");
        System.out.print("Elige tu opcion: ");
        int opcion = entrada.nextInt();

        System.out.print("Dame la distancia: ");
        double distancia = entrada.nextDouble();

        if (distancia < 0) {
            System.out.println("La distancia no debe ser inferior a cero");
            return;
        }

        double tiempo = 0;
        switch (opcion) {
            case 1:
                tiempo = distancia / 1100;
                break;
            case 2:
                tiempo = distancia / 4900;
                break;
            case 3:
                tiempo = distancia / 16400;
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        System.out.printf("El tiempo requerido es de %.4f", tiempo);
    }
}
