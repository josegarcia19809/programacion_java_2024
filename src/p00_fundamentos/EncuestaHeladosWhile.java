package p00_fundamentos;

import java.util.Scanner;

public class EncuestaHeladosWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Encuesta de helados");

        char respuesta;
        int vecesSi = 0;
        int contador = 1;
        while (contador <= 3) {
            System.out.print("¿Te gusta el helado de limón? (S o N): ");
            respuesta = entrada.next().charAt(0);
            if (respuesta == 'S' || respuesta == 's') {
                vecesSi++;
            }
            contador++;
        }
        System.out.println(vecesSi + " personas les gusta el helado de limón");
    }
}
