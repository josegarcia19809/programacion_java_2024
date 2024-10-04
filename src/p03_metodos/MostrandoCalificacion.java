package p03_metodos;

public class MostrandoCalificacion {
    public static void mostrarCalificacion(int calificacion) {
        System.out.println("Tu calificación es " + calificacion);
    }

    public static void main(String[] args) {
        mostrarCalificacion(90); // Literal

        int miCalificacion = 70;
        mostrarCalificacion(miCalificacion); // Variable

        mostrarCalificacion(30 * 3); // Expresión

        mostrarCalificacion(Integer.parseInt("100")); // Lo que devuelve otro método
    }

}
