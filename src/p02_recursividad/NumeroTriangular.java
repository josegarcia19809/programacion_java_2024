package p02_recursividad;

public class NumeroTriangular {
    public static void main(String[] args) {
        System.out.println(triangular(5));
    }

    public static int triangular(int n) {
        if (n == 1) return 1; // Caso base
        return n + triangular(n - 1);// Caso recursivo
    }
}
