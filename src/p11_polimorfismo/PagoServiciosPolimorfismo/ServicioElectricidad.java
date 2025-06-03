package p11_polimorfismo.PagoServiciosPolimorfismo;

public class ServicioElectricidad extends Servicio {
    private double consumoKwh;
    private double tarifaKwh;

    public ServicioElectricidad(String nombre, double consumoKwh, double tarifaKwh) {
        super(nombre);
        this.consumoKwh = consumoKwh;
        this.tarifaKwh = tarifaKwh;
    }

    @Override
    public double calcularPago() {
        return consumoKwh * tarifaKwh;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", consumo: " + consumoKwh + " kWh" +
                ", tarifa: " + tarifaKwh + " $/kWh" +
                ", pago: $" + String.format("%.2f", calcularPago());
    }
}
