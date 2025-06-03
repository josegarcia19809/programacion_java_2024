package p11_polimorfismo.PagoServiciosPolimorfismo;

public class ServicioInternet extends Servicio {
    private double datosConsumidosGb;
    private double tarifaPorGb;

    public ServicioInternet(String nombre, double datosConsumidosGb, double tarifaPorGb) {
        super(nombre);
        this.datosConsumidosGb = datosConsumidosGb;
        this.tarifaPorGb = tarifaPorGb;
    }

    @Override
    public double calcularPago() {
        double porcentajeAumento = 15 / 100.00;
        return (datosConsumidosGb * tarifaPorGb) +
                (datosConsumidosGb * tarifaPorGb) * porcentajeAumento;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", consumo: " + datosConsumidosGb + " GB" +
                ", tarifa: " + tarifaPorGb + " $/GB" +
                ", pago: $" + String.format("%.2f", calcularPago());
    }
}

