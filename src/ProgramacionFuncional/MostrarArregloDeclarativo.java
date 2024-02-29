package ProgramacionFuncional;
import java.util.stream.IntStream;
public class MostrarArregloDeclarativo {
    public static void main(String[] args) {
        int[] valores = {3, 10, 6, 1, 4, 8, 2,
                5, 9, 7};
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
    }
}
