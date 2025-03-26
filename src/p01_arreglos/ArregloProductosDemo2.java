package p01_arreglos;

import java.util.Scanner;

public class ArregloProductosDemo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int PRODUCTOS = 3;

        float[] precios = new float[PRODUCTOS];
        System.out.println("Precios de productos");
        for (int i = 0; i < PRODUCTOS; i++) {
            System.out.print("Dame precio #" + (i + 1) + ": ");
            precios[i] = entrada.nextFloat();
        }
        // Mostrar los precios
        System.out.println("Los precios que ingresaste fueron");
        for (int i = 0; i < PRODUCTOS; i++) {
            System.out.println("Precio #" + (i + 1) + ": " + precios[i]);
        }
    }
}
