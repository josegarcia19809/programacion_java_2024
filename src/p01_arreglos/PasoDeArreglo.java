package p01_arreglos;

public class PasoDeArreglo {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        mostrarArreglo(numeros);

    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
