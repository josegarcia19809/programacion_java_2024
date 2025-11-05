package p00_fundamentos;

class Gallina {
    String nombre;
    private String especie;
    private int huevos;

    public Gallina(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.huevos = 0;
    }

    public void ponerHuevo() {
        this.huevos++;
    }

    public int obtenerCantidadHuevos() {
        return this.huevos;
    }

    public String obtenerDatos() {
        return "Nombre: " + this.nombre + ", especie: " + this.especie +
                ", ha puesto " + this.huevos + " huevos";
    }
}

public class GallinaPrueba {

    public static void main(String[] args) {
        // ------------ gallina 1
        Gallina gallina1 = new Gallina("Lola", "Leghorn");
        System.out.println(gallina1.obtenerDatos());

        gallina1.ponerHuevo();
        System.out.println(gallina1.nombre + " ha puesto " + gallina1.obtenerCantidadHuevos() +
                " huevo(s)");
        System.out.println(".".repeat(100));

        //------------ gallina 2
        Gallina gallina2 = new Gallina("Turuleka", "Lohman");
        for (int i = 1; i <= 100; i++) {
            gallina2.ponerHuevo();
        }
        System.out.println(gallina2.obtenerDatos());
        System.out.println();
        System.out.println(".".repeat(100));

        //-------- gallina 3: poner 12 huevos
        // Que vaya mostrando cuántos huevos ha puesto en secuencia
        Gallina gallina3 = new Gallina("Chabela", "Isa Brown");
        for (int i = 1; i <= 12; i++) {
            gallina3.ponerHuevo();
            System.out.println(gallina3.obtenerDatos());
        }
        System.out.println(".".repeat(100));
    }
}
