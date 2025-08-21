package p00_fundamentos;

import java.util.Scanner;

public class AlmacenCajas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame cantidad de cajas: ");
        int cajas = entrada.nextInt();

        // Calcular estantes completos (/)
        int estantesCompletos = cajas / 6;

        // Calcular cajas sobrantes (%) módulo
        int cajasSobrantes = cajas % 6;

        // Mostrar resultados
        System.out.println("Estantes completos: " + estantesCompletos);
        System.out.println("Cajas sobrantes: " + cajasSobrantes);
    }
}

/*
 * Un almacen tiene 47 cajas y quiere organizarlas
 * en estantes de 6 cajas cada uno.
 * Escribe un programa que muestre:
 * Cuántos estantes completos se pueden llenar
 * Cuántas cajas sobran
 * */