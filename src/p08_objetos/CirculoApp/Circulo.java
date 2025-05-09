package p08_objetos.CirculoApp;

public class Circulo {
    private double radio;
    private final double PI = Math.PI;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void establecerRadio(double radio) {
        this.radio = radio;
    }

    public double obtenerRadio() {
        return this.radio;
    }

    public double obtenerArea() {
        return PI * Math.pow(this.radio, 2);
    }

    public double obtenerDiametro() {
        return this.radio * 2;
    }

    public double obtenerCircunferencia() {
        return 2.0 * PI * this.radio;
    }
}
