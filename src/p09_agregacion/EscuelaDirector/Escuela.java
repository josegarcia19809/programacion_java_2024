package p09_agregacion.EscuelaDirector;

public class Escuela {
    private String nombre;
    private String tipo;
    private Director directorUnico;

    // Constructor
    public Escuela(String nombre, String tipo, Director directorU) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.directorUnico = directorU;
    }

    // Métodos get
    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public Director getDirectorUnico() {
        return this.directorUnico;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, tipo: %s", this.getNombre(), this.getTipo());
    }
}
