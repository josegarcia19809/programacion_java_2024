package p11_polimorfismo.FacturacionRestaurante;

// Subclase Entrada
public class Entrada extends Plato {
    private double cargoServicio;

    public Entrada(String nombre, double precioBase, double cargoServicio) {
        super(nombre, precioBase);
        this.cargoServicio = cargoServicio;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + cargoServicio;
    }
}

