package p11_polimorfismo.FacturacionRestaurante;

// Subclase PlatoPrincipal
public class PlatoPrincipal extends Plato {
    private double cargoIngredientesExtra;

    public PlatoPrincipal(String nombre, double precioBase, double cargoIngredientesExtra) {
        super(nombre, precioBase);
        this.cargoIngredientesExtra = cargoIngredientesExtra;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + cargoIngredientesExtra;
    }
}

