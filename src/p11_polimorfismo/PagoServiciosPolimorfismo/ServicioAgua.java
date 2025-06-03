package p11_polimorfismo.PagoServiciosPolimorfismo;

public class ServicioAgua extends Servicio {
    private double consumoM3;
    private double tarifaM3;

    public ServicioAgua(String nombre, double consumoM3, double tarifaM3) {
        super(nombre);
        this.consumoM3 = consumoM3;
        this.tarifaM3 = tarifaM3;
    }

    @Override
    public double calcularPago() {
        return consumoM3 * tarifaM3;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", consumo: " + consumoM3 + " m³" +
                ", tarifa: " + tarifaM3 + " $/m³" +
                ", pago: $" + String.format("%.2f", calcularPago());
    }
}
