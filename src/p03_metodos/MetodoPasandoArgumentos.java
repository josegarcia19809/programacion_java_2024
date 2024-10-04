package p03_metodos;

public class MetodoPasandoArgumentos {
    public static void main(String[] args) {
        mostrarValor(8);
        int x = 10;
        mostrarValor(x);
        mostrarValor(x * 4);
        mostrarValor(Integer.parseInt("700"));
    }

    public static void mostrarValor(int num) {
        System.out.println("El valor es " + num);
    }
}
