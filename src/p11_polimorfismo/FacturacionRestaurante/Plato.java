package p11_polimorfismo.FacturacionRestaurante;

// Clase base concreta
public class Plato {
    protected String nombre;
    protected double precioBase;

    public Plato(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularPrecioFinal() {
        // Por defecto, solo el precio base
        return precioBase;
    }
}

