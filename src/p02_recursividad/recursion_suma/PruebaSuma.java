package p02_recursividad.recursion_suma;

public class PruebaSuma {
    public static void main(String[] args) {
        OperacionSuma suma = new OperacionSuma();
        System.out.println(suma.sumaRecursiva(5));
        System.out.println(suma.sumaIterativa(5));
    }
}
