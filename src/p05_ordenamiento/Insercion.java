package p05_ordenamiento;

public class Insercion {
    public static void ordenarPorInsercion(int[] x) {
        int aux, k;
        boolean sw;
        int N = x.length;
        for (int i = 1; i <= N - 1; i++) {
            aux = x[i];
            k = i - 1;
            sw = false;
            while (!sw && k >= 0) {
                if (aux < x[k]) {
                    x[k + 1] = x[k];
                    k--;
                } else {
                    sw = true;
                }
            }
            x[k + 1] = aux;
        }
    }

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

    public static void main(String[] args) {
        int[] numeros = llenarArreglo();
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        ordenarPorInsercion(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }
}
