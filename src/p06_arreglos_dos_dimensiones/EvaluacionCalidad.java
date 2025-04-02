package p06_arreglos_dos_dimensiones;

public class EvaluacionCalidad {
    public static void main(String[] args) {
        final int PRODUCTOS = 5;
        final int CRITERIOS = 5;

        int[][] evaluaciones = {
                {8, 7, 9, 8, 7},
                {9, 8, 7, 9, 8},
                {6, 7, 6, 7, 6},
                {9, 9, 8, 9, 9},
                {7, 6, 8, 7, 7}
        };

        System.out.println("Evaluaciones de calidad");
        for (int i = 0; i < PRODUCTOS; i++) {
            System.out.printf("Producto #%d:\t", (i + 1));
            for (int j = 0; j < CRITERIOS; j++) {
                System.out.printf("%d\t", evaluaciones[i][j]);
            }
            System.out.println();
        }
    }
}
