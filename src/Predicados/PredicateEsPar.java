package Predicados;

import java.util.function.Predicate;

public class PredicateEsPar {
    public static void main(String[] args) {
        // Creamos un Predicate para comprobar si un
        // número es par
        Predicate<Integer> esPar = num -> num % 2 == 0;

        // Probamos el Predicate con algunos números
        System.out.println(esPar.test(4)); // Devuelve true
        System.out.println(esPar.test(7)); // Devuelve false
    }
}
