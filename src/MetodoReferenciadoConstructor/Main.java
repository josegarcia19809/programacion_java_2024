package MetodoReferenciadoConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("10", "23", "15", "12", "24");
        //getResults(numeros, numeroStr -> Integer.valueOf(numeroStr));
        getResults(numeros, Integer::new).forEach(num -> System.out.println(num * 100));
        System.out.println(); // Desde Java 9 no se aconseja utilizar lo anterior
        getResults(numeros, Integer::valueOf).forEach(num -> System.out.println(num * 10));

    }

    public static List<Integer> getResults(List<String> datos, Function<String, Integer> func) {
        List<Integer> resultados = new ArrayList<>();

        datos.forEach(strNum -> resultados.add(func.apply(strNum)));
        return resultados;
    }
}
