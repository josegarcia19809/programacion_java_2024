package p08_objetos.ArticuloMinoristaApp;

public class ArticuloMinorista {
    private String descripcion;
    private int unidadesDisponibles;
    private double precio;

    public void establecerDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void establecerUnidadesDisponibles(int unidades) {
        this.unidadesDisponibles = unidades;
    }

    public void establecerPrecio(double precio) {
        this.precio = precio;
    }

    public String obtenerDescripcion() {
        return this.descripcion;
    }

    public int obtenerUnidadesDisponibles() {
        return this.unidadesDisponibles;
    }

    public double obtenerPrecio() {
        return this.precio;
    }

    public String obtenerDatos() {
        String salida = "";
        salida += "Artículo \n";
        salida += "Descripción: " + this.descripcion +
                "\nUnidades disponibles: " + this.unidadesDisponibles +
                "\nPrecio: " + this.precio;
        return salida;
    }
}
