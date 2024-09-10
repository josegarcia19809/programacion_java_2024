package p01_arreglos;

public class ArregloTemperaturas {
    public static void main(String[] args) {
        double[] temperaturas = new double[4];
        temperaturas[0] = 3.4;
        temperaturas[1] = 5.8;
        temperaturas[2] = 20.0;
        temperaturas[3] = 40.0;

        int longitudArreglo = temperaturas.length;
        System.out.println("Tamaño del arreglo: " +
                longitudArreglo);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("temperatura " + i +
                    ": " + temperaturas[i]);
        }
    }
}
