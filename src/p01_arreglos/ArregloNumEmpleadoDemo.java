package p01_arreglos;

import java.util.Scanner;

public class ArregloNumEmpleadoDemo {
    public static void main(String[] args) {
        System.out.println("-".repeat(100));
        Scanner entrada = new Scanner(System.in);

        final int EMPLEADOS = 4;
        int[] numerosDeEmpleado = new int[EMPLEADOS];
        System.out.println("Numeros de " + EMPLEADOS + " empleados");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.print("Dame número del empleado #" + (i + 1) + ": ");
            numerosDeEmpleado[i] = entrada.nextInt();
        }

        // Mandar a imprimir los números
        System.out.println("Aquí están los números ingresados");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.println("Número del empleado #" + (i + 1) + ": " +
                    numerosDeEmpleado[i]);
        }
    }
}
