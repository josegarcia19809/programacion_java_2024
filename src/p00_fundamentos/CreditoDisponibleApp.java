package p00_fundamentos;

import java.util.Scanner;

public class CreditoDisponibleApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame la cantidad maxima de credito: ");
        double creditoMaximo = entrada.nextDouble();

        System.out.print("Ingresa el credito utilizado: ");
        double creditoUtilizado = entrada.nextDouble();

        double creditoDisponible = creditoMaximo - creditoUtilizado;
        System.out.println("El credito disponible es: " + creditoDisponible);
    }
}
