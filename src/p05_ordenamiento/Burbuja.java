package p05_ordenamiento;

public class Burbuja {
    public static int[] llenarArreglo() {
        int[] valores = {10, 9, 7, 4, 6, 5, 3, 8, 2, 1};
        return valores;
    }

    public static void imprimirArreglo(int[] numeros) {
        for (int num : numeros) {
            System.out.print("\t" + num);
        }
        System.out.println();
    }

    public static void ordenarPorBurbuja(int[] x) {
        int aux;
        int N = x.length;
        for (int i = 0; i <= N - 2; i++) {
            for (int j = 0; j <= N - 2; j++) {
                if (x[j] > x[j + 1]) {
                    // intercambiar
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = llenarArreglo();
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        ordenarPorBurbuja(numeros);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
        System.out.println("-".repeat(100));
    }
}
