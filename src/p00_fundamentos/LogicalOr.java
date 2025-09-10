package p00_fundamentos;

import java.util.Scanner;

public class LogicalOr {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Obtener el salario anual del empleado
        System.out.print("¿Cuál es su salario anual? ");
        double salario = entrada.nextDouble();

        // Obtener años de antigüedad
        System.out.print("¿Cuántos años has estado en tu trabajo actual? ");
        int aniosEnTrabajo = entrada.nextInt();

        // Determinar si el usuario califica para el préstamo
        if (salario >= 50000 || aniosEnTrabajo >= 2) {
            System.out.println("Califica para el préstamo");
        } else {
            System.out.println("No califica para el préstamo");
        }
    }
}
