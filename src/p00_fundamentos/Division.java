package p00_fundamentos;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;
        double resultado;

        // pedir los 2 números
        System.out.print("Escribe un entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escribe otro entero: ");
        numero2 = entrada.nextInt();

        if (numero2 == 0) {
            System.out.println("La división entre cero no es posible");
            System.out.println("Por favor, ejecute el programa nuevamente");
            System.out.println("Y escriba un número divisor diferente que cero");
        } else {
            resultado = (double) numero1 / numero2;
            System.out.println("El resultado de dividir " + numero1 + " entre " +
                    numero2 + " es " + resultado);
        }

    }
}
