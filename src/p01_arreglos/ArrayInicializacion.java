package p01_arreglos;

public class ArrayInicializacion {
    public static void main(String[] args) {
        int[] dias = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        for (int index = 0; index < 12; index++) {
            System.out.println("Mes " + (index + 1) +
                    " tiene " +
                    dias[index] + " días");
        }
    }
}
