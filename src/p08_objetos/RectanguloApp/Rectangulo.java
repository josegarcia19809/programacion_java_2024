package p08_objetos.RectanguloApp;

public class Rectangulo {
    private double longitud;
    private double ancho;

    public void establecerLongitud(double lon) {
        this.longitud = lon;
    }

    public void establecerAncho(double anch) {
        this.ancho = anch;
    }

    public double obtenerLongitud() {
        return this.longitud;
    }

    public double obtenerAncho() {
        return this.ancho;
    }

    public double obtenerArea() {
        return this.longitud * this.ancho;
    }
}

