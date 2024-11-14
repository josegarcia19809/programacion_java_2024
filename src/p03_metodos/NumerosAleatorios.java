package p03_metodos;

import java.util.Random;

public class NumerosAleatorios {
    public static int[] llenarArreglo() {
        int[] aleatorios = new int[10];
        Random random = new Random(20);
        for (int i = 0; i < 10; i++) {
            aleatorios[i] = random.nextInt(6) + 1;
        }
        return aleatorios;
    }

    public static void imprimirArreglo(int[] arregloAleatorios) {
        System.out.print("Valores: ");
        for (int valor : arregloAleatorios) {
            System.out.print("\t" + valor);
        }
        System.out.println();
        System.out.println("-".repeat(100));
    }

    public static void main(String[] args) {
        int[] arregloAleatorios = llenarArreglo();
        imprimirArreglo(arregloAleatorios);
    }
}
