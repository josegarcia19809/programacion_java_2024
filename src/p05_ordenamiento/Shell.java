package p05_ordenamiento;

public class Shell {

    public static int[] llenarArreglo() {
        return new int[]{10, 9, 7, 4, 6, 5, 3, 8, 2, 1};
    }

    public static void imprimirArreglo(int[] numeros) {
        for (int num : numeros) {
            System.out.print("\t" + num);
        }
        System.out.println();
    }

    public static void ordenarPorShell(int[] x) {
        int intervalo, nuevoElemento, j;
        intervalo = x.length / 2;

        while (intervalo > 0) {
            for (int i = intervalo; i <= x.length - 1; i++) {
                nuevoElemento = x[i];
                j = i;
                while (j >= intervalo && x[j - intervalo] > nuevoElemento) {
                    x[j] = x[j - intervalo];
                    j = j - intervalo;
                }
                x[j] = nuevoElemento;
                imprimirArreglo(x);
            }
            intervalo = intervalo / 2;

        }
    }

    public static void main(String[] args) {
        int[] numeros = llenarArreglo();
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        ordenarPorShell(numeros);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
        System.out.println("-".repeat(100));
    }
}
