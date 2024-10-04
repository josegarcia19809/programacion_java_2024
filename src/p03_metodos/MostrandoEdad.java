package p03_metodos;

public class MostrandoEdad {
    public static void mostrarEdad(int edad) {
        System.out.println("Tu edad es " + edad + " años");
    }

    public static void main(String[] args) {
        mostrarEdad(23); // literal

        int anios = 30;
        mostrarEdad(anios); // variable

        mostrarEdad(10 * 4); // expresión
        mostrarEdad(Integer.parseInt("32"));
    }
}
