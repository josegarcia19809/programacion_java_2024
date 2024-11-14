package p03_metodos;

import java.util.Random;

// Contar las ocurrencias de números
public class ContarOcurrencias {

    // métod0 para llenar un arreglo de 20 casillas con enteros entre 1 y 10.
    // Debe devolver un arreglo
    public static int[] llenarArreglo() {
        int[] numeros = new int[20];
        Random random = new Random(10);
        for (int i = 0; i < 20; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }
        return numeros;
    }

    // métod0 para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("Valores: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Métod0 que reciba el arreglo y cuente las ocurrencias de cada número
    public static void contarOcurrencias(int[] arreglo) {
        System.out.println("-".repeat(100));
        System.out.println("Ocurrencias");
        for (int numero = 1; numero <= 10; numero++) {
            int conteos = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == numero) {
                    conteos++;
                }
            }
            System.out.println(numero + ": " + conteos);
        }
    }

    public static void main(String[] args) {
        int[] numerosAleatorios = llenarArreglo();
        imprimirArreglo(numerosAleatorios);
        contarOcurrencias(numerosAleatorios);
        System.out.println("-".repeat(100));
    }
}
