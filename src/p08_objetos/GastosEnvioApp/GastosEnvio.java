package p08_objetos.GastosEnvioApp;

public class GastosEnvio {
    private double peso;

    public GastosEnvio(double peso) {
        this.peso = peso;
    }

    public double calcularGastosEnvio() {
        double tarifa = 0.0;
        if (peso <= 2.0) {
            tarifa = 1.10;
        } else if (peso > 2 && peso <= 6) {
            tarifa = 2.20;
        } else if (peso > 6 && peso <= 10) {
            tarifa = 3.70;
        } else if (peso > 10) {
            tarifa = 4.80;
        }
        return tarifa;
    }
}
