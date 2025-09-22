package p00_fundamentos;

import java.util.Scanner;

public class IngresoTotalPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sueldo, ingresoTotal, promedioSueldo;
        int contador;

        ingresoTotal = 0;
        contador = 1;

        while (contador <= 6) {
            System.out.print("Ingrese el sueldo del mes " + contador + ": ");
            sueldo = entrada.nextDouble();
            ingresoTotal = ingresoTotal + sueldo;
            contador = contador + 1;
        }

        promedioSueldo = ingresoTotal / 6;

        System.out.println("El ingreso total es: " + ingresoTotal);
        System.out.println("El promedio mensual es: " + promedioSueldo);

        entrada.close();
    }
}
