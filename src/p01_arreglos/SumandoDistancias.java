package p01_arreglos;

public class SumandoDistancias {
    public static void main(String[] args) {
        float[] distancias = {3.1F, 5.2f, 7.2f, 2.5f};
        System.out.println("La suma de las distancias recorridas fue de " +
                calcularDistanciaRecorrida(distancias)+" km.");
    }

    public static float calcularDistanciaRecorrida(float[] distanciasRecorridas) {
        float total = 0.0f;
        for (float distanciaRecorrida : distanciasRecorridas) {
            total = total + distanciaRecorrida;
        }
        return total;
    }
}
