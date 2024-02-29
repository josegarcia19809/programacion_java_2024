package ProgramacionFuncional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConteoSetImperativo {
    public static void main(String[] args) {
        Double[] numeros = {2.4, 55.6, 90.12,
                26.6, 100.0};
        Set<Double> conjuntoNumeros=
                new HashSet<>(Arrays.asList(numeros));
        int conteo=0;
        for(double numero: conjuntoNumeros){
            if(numero> 60){
                conteo++;
            }
        }
        System.out.printf("Total de valores mayores " +
                "que 60: %d", conteo);
    }
}
