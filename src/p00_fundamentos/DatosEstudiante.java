package p00_fundamentos;

public class DatosEstudiante {

    public static void mostrarNombre() {
        System.out.println("Nombre: José Luis García");
        imprimirLinea();
    }

    public static void visualizarCarrera() {
        System.out.println("Carrera: Ing. en Computación");
        imprimirLinea();
    }

    public static void desplegarPromedio() {
        System.out.println("Promedio: 8.8");
        imprimirLinea();
    }

    public static void imprimirLinea() {
        System.out.println("-".repeat(100));
    }

    public static void main(String[] args) {
        System.out.println("Datos estudiante:");
        mostrarNombre();
        visualizarCarrera();
        desplegarPromedio();
    }
}
