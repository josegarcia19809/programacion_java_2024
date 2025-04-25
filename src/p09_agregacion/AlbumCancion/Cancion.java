package p09_agregacion.AlbumCancion;

public class Cancion {
    private String nombre;
    private String duracion;
    private double precio;

    // Constructor
    public Cancion(String nombre, String duracion, double precio) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    // Métodos get
    public String getNombre() {
        return this.nombre;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        String salida = "Canción\n";
        salida += String.format("Nombre: %s%n", this.getNombre());
        salida += String.format("Duración: %s%n", this.getDuracion());
        salida += String.format("Precio: $%.2f%n", this.getPrecio());
        return salida;
    }
}
