package p03_metodos;

public class ReturnArray {

    public static double[] getArray() {
        double[] array = {1.2, 2.3, 3.4, 6.7, 8.9};
        return array;
    }

    public static void main(String[] args) {
        double[] values;
        values = getArray();
        for (double num : values) {
            System.out.print(num + " ");
        }
    }
}
