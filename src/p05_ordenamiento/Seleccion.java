package p05_ordenamiento;

public class Seleccion {
    public static void ordenarPorSeleccion(int[] x) {
        int aux, k;
        int N = x.length;
        for (int i = 0; i <= N - 2; i++) {
            aux = x[i];
            k = i;
            for (int j = i; j <= N - 1; j++) {
                if (x[j] < aux) {
                    aux = x[j];
                    k = j;
                }
            }
            x[k] = x[i];
            x[i] = aux;
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

        ordenarPorSeleccion(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

}
