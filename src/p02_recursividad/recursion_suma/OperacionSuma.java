package p02_recursividad.recursion_suma;

public class OperacionSuma {
    // Para sumar los primeros n numeros
    public int sumaIterativa(int n) {
        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            resultado += i;
        }
        return resultado;
    }

    public int sumaRecursiva(int n) {
        if (n == 1) return 1;
        return n + sumaRecursiva(n - 1);
    }
}
