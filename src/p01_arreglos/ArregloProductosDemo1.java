package p01_arreglos;

import java.util.Scanner;

public class ArregloProductosDemo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int PRODUCTOS = 3;

        float[] precios = new float[PRODUCTOS];
        // Pedir los precios
        System.out.print("Dame precio 1: ");
        precios[0] = entrada.nextFloat();

        System.out.print("Dame precio 2: ");
        precios[1] = entrada.nextFloat();

        System.out.print("Dame precio 3: ");
        precios[2] = entrada.nextFloat();

        // Imprimir esos precios en pantalla
        System.out.println("Precio 1: " + precios[0]);
        System.out.println("Precio 2: " + precios[1]);
        System.out.println("Precio 3: " + precios[2]);
    }
}
