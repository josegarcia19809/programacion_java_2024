package p08_objetos.VelocidadSonidoApp;

public class VelocidadSonido {
    private double distancia;

    public VelocidadSonido(double distancia) {
        this.distancia = distancia;
    }

    public double calcularTiempoEnAire() {
        final double velocidadAire = 1100.00;
        return distancia / velocidadAire;
    }

    public double calcularTiempoEnAgua() {
        final double velocidadAgua = 4900.00;
        return distancia / velocidadAgua;
    }

    public double calcularTiempoEnAcero() {
        final double velocidadAcero = 16400.00;
        return distancia / velocidadAcero;
    }
}
