package p06_arreglos_dos_dimensiones;

public class TemperaturasPorCiudad {
    public static void main(String[] args) {
        final int CIUDADES = 3;
        final int DIAS = 7;
        double[][] temperaturas = {
                {22, 24, 23, 21, 25, 26, 24},
                {18, 19, 20, 22, 21, 19, 20},
                {30, 31, 29, 28, 32, 33, 31}
        };
        System.out.println("Temperaturas");
        for (int i = 0; i < CIUDADES; i++) {
            System.out.printf("Ciudad #%d: ", (i + 1));
            for (int j = 0; j < DIAS; j++) {
                System.out.printf("%.1f\t", temperaturas[i][j]);
            }
            System.out.println();
        }
    }
}
