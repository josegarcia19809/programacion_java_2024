package p00_fundamentos;

import java.util.Scanner;

public class NominaPago {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTrabajadas;
        double pagoTotal;
        double pagoPorHora;

        System.out.println("Programa que calcula la nomina de un trabajador por horas");

        System.out.print("Dame horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        System.out.print("Dame pago por hora: ");
        pagoPorHora = entrada.nextDouble();

        pagoTotal = horasTrabajadas * pagoPorHora;
        System.out.println("Tu pago total es de $" + pagoTotal);
    }
}
