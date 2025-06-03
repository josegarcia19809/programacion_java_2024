package p11_polimorfismo.PagoServiciosPolimorfismo;

public class ServicioGas extends Servicio {
    private double consumoLitros;
    private double tarifaLitro;

    public ServicioGas(String nombre, double consumoLitros, double tarifaLitro) {
        super(nombre);
        this.consumoLitros = consumoLitros;
        this.tarifaLitro = tarifaLitro;
    }

    @Override
    public double calcularPago() {
        return consumoLitros * tarifaLitro;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", consumo: " + consumoLitros + " litros" +
                ", tarifa: " + tarifaLitro + " $/litro" +
                ", pago: $" + String.format("%.2f", calcularPago());
    }
}
