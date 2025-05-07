package p08_objetos.NominaApp;

import java.util.Scanner;

public class NominaPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Pago de nómina");

        System.out.print("Dame horas trabajadas: ");
        int horas = entrada.nextInt();

        System.out.print("Dame pago por hora: ");
        double pago = entrada.nextDouble();

        // Crear una instancia de Nomina
        Nomina miNomina = new Nomina(horas, pago);
        System.out.printf("El pago bruto es de $%.2f", miNomina.calcularSalarioBruto());
    }
}
