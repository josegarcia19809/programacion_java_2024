package p01_arreglos;

import java.util.Arrays;

public class ArregloPuntuaciones {
    public static void main(String[] args) {
        int[] puntuaciones = {7, 8, 9, 10, 11};
        System.out.println("Arreglo original: " +
                Arrays.toString(puntuaciones));
        ++puntuaciones[2];
        puntuaciones[4]++;

        System.out.println("Después de los incrementos:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(puntuaciones[i]);
        }
    }
}
