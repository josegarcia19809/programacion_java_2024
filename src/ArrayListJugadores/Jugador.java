package ArrayListJugadores;

public class Jugador {
    private String nombre;
    private int goles;

    public Jugador(String nombre, int goles) {
        this.nombre = nombre;
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", goles: " + goles;
    }
}
