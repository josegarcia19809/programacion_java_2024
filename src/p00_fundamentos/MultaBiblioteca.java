package p00_fundamentos;

import java.util.Scanner;

public class MultaBiblioteca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que calcula el monto total de una multa pagada a la " +
                "biblioteca");

        System.out.print("Dame la cantidad de días posteriores a la fecha de devolución del " +
                "libro: ");
        int diasAtrasados = entrada.nextInt();

        System.out.print("Dame cobro de la multa por día: ");
        double cobroPorDia = entrada.nextDouble();

        double multaTotal = diasAtrasados * cobroPorDia;
        System.out.println("La multa total es de " + multaTotal);
    }
}
