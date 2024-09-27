package p03_metodos;

/*
 * Se quiere mostrar los datos de un estudiante, cada dato se mostrará en un
 * métod0 diferente
 * nombre: mostrarNombre()
 * carrera: visualizarCarrera()
 * promedio: desplegarPromedio()
 * */
public class DatosEstudiante {
    public static void main(String[] args) {
        mostrarNombre();
        visualizarCarrera();
        desplegarPromedio();
    }

    public static void mostrarNombre() {
        System.out.println("Mi nombre es José L. García");
        imprimirLinea();
    }

    public static void visualizarCarrera() {
        System.out.println("Mi carrera es Ingeniería en Computación");
        imprimirLinea();
    }

    public static void desplegarPromedio() {
        System.out.println("Mi promedio es 8.8");
        imprimirLinea();
    }

    public static void imprimirLinea() {
        System.out.println("-".repeat(100));
    }
}
