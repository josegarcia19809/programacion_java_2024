package p03_metodos;

import java.util.Scanner;

public class ParesImpares {
    public static int[] llenarArreglo() {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Dame valor " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();
        }
        return valores;
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("Valores: ");
        for (int valor : arreglo) {
            System.out.print("\t" + valor);
        }
        System.out.println();
        System.out.println("-".repeat(100));
    }

    public static int cantidadPares(int[] numeros) {
        int cuenta = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static int cantidadImpares(int[] numeros) {
        int cuenta = 0;
        for (int num : numeros) {
            if (num % 2 == 1) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static void main(String[] args) {
        int[] numeros = llenarArreglo();
        imprimirArreglo(numeros);
        int pares = cantidadPares(numeros);
        int impares = cantidadImpares(numeros);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        // 31, 21, 41, 2, 14, 17, 30, 1, 10, 9
    }
}
