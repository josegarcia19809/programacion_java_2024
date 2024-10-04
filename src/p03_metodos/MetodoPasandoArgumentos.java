package p03_metodos;

public class MetodoPasandoArgumentos {
    public static void main(String[] args) {
        mostrarValor(8); // Pasando un literal

        // Pasando una variable
        int x = 10;
        mostrarValor(x);

        // Pasando una expresión
        mostrarValor(x * 4);

        // Pasando lo que devuelve otro método
        mostrarValor(Integer.parseInt("700"));

        short s = 1;
        mostrarValor(s); // Convierte short a int

        byte b = 2;
        mostrarValor(b); // Convierte byte a int

        double d = 1.0;
        mostrarValor((int) d); // Esto funcionará
    }

    public static void mostrarValor(int num) {
        System.out.println("El valor es " + num);
    }
}
