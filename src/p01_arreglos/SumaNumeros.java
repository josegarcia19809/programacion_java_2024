package p01_arreglos;

public class SumaNumeros {
    public static void main(String[] args) {
        int[] valores = {16, 8, 7, 8};
        int sumaValores = sumarElementos(valores);
        System.out.println("La suma total es " + sumaValores);

    }

    public static int sumarElementos(int[] numeros) {
        int total = 0;
        for (int n : numeros) {
            total = total + n;
        }
        return total;
    }
}
