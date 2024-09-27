package p03_metodos;

import java.util.Scanner;

/*
 * Este programa le pedirá al usuario que ingrese su salario anual y su
 * calificación crediticia. Luego el programa determina si el usuario califica para
 * una tarjeta de credito. Los mensajes para mostrar si está aprobado o
 * no está aprobado se crearan en 2 métodos.
 * */
public class TarjetaCredito {
    public static void main(String[] args) {
        System.out.println("-".repeat(100));
        Scanner entrada = new Scanner(System.in);
        double salario;
        int calificacionCrediticia;

        System.out.println("¿Cuál es tu salario anual? ");
        salario = entrada.nextDouble();

        // Pedir la calificación crediticia del 1 al 10
        System.out.println("En una escala del 1 al 10 " +
                "¿Cuál sería tu calificación crediticia? " +
                "\n 10=excelente, 1=muy mala: ");
        calificacionCrediticia = entrada.nextInt();

        // Determinar si el usuario califica
        if (salario >= 2000 && calificacionCrediticia >= 7) {
            siCalifica();
        } else {
            noCalifica();
        }
    }

    public static void siCalifica() {
        System.out.println("Felicidades 😄,  si calificas para la tarjeta de credito");
    }

    public static void noCalifica() {
        System.out.println("Lo sentimos 🥲, no calificas para la tarjeta de credito");
    }
}
