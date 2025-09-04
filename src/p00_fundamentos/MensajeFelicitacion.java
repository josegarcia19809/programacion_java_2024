package p00_fundamentos;

import java.util.Scanner;

public class MensajeFelicitacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double calificacion1, calificacion2, calificacion3;
        System.out.println("Este programa saca el promedio de 3 calificaciones");

        // Pedir las 3 calificaciones
        System.out.print("Ingresa la calificación #1: ");
        calificacion1 = entrada.nextDouble();

        System.out.print("Ingresa la calificación #2: ");
        calificacion2 = entrada.nextDouble();

        System.out.print("Ingresa la calificación #3: ");
        calificacion3 = entrada.nextDouble();

        // Sacar el promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;

        System.out.println("Promedio: " + promedio);
        if (promedio > 95) {
            System.out.println("Fue un gran promedio");
        }
    }
}
