package p08_objetos.RectanguloApp;

public class RectanguloPrueba {
    public static void main(String[] args) {
        // Creando un objeto de tipo Rectangulo que se llama caja
        Rectangulo caja = new Rectangulo();

        // Llamando a los métodos establecerLongitud y establecerAncho
        caja.establecerLongitud(10);
        caja.establecerAncho(20.0);

        // Muestra longitud y ancho del objeto caja
        System.out.println("La longitud de caja es " + caja.obtenerLongitud());
        System.out.println("La anchura de caja es " + caja.obtenerAncho());

        // Mostrar el área del objeto caja
        System.out.println("El área de caja es " + caja.obtenerArea());
    }
}
