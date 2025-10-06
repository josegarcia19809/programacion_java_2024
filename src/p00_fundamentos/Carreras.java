package p00_fundamentos;

/*crear 6 métodos. Cada método imprimirá
 * el nombre de una carrera*/
public class Carreras {

    public static void mostrarCarreraIngenieria() {
        System.out.println("- Ingeniería en Computación 💻");
    }

    public static void mostrarCarreraDerecho() {
        System.out.println("- Lic. en Derecho 💼");
    }

    public static void mostrarCarreraContador() {
        System.out.println("- Lic. en Contaduria 📊");
    }

    public static void mostrarCarreraPsicologia() {
        System.out.println("- Lic. en Psicología 😵‍💫");
    }

    public static void mostrarCarreraInformaticaAdministrativa() {
        System.out.println("- Lic. en Informática Administrativa 🖥️");
    }

    public static void main(String[] args) {
        System.out.println("Las carreras que ofrece el " +
                "Centro Universitario UAEM Atlacomulco");
        mostrarCarreraIngenieria();
        mostrarCarreraContador();
        mostrarCarreraDerecho();
        mostrarCarreraPsicologia();
        mostrarCarreraInformaticaAdministrativa();
    }
}
