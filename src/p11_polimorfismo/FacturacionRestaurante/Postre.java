package p11_polimorfismo.FacturacionRestaurante;

// Subclase Postre
public class Postre extends Plato {
    private double costoPreparacion;

    public Postre(String nombre, double precioBase, double costoPreparacion) {
        super(nombre, precioBase);
        this.costoPreparacion = costoPreparacion;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + costoPreparacion;
    }
}

