package p01_fundamentos;

import java.util.Scanner;

public class SaldoCuenta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldoInicial;
        double totalDepositos;
        double totalRetiros;
        double saldoFinal;

        System.out.println("SALDO DE UNA CUENTA");

        System.out.print("Dame saldo inicial: ");
        saldoInicial = entrada.nextDouble();

        System.out.print("Dame total de depositos: ");
        totalDepositos = entrada.nextDouble();

        System.out.print("Dame total de retiros: ");
        totalRetiros = entrada.nextDouble();

        saldoFinal = saldoInicial + totalDepositos - totalRetiros;
        System.out.println("El saldo actual de la cuenta es: " + saldoFinal);
    }
}
