package p08_objetos.ArticuloMinoristaApp;

public class ArticuloMinoristaPrueba {
    public static void main(String[] args) {
        ArticuloMinorista articulo1 = new ArticuloMinorista();
        articulo1.establecerDescripcion("Chaqueta");
        articulo1.establecerUnidadesDisponibles(20);
        articulo1.establecerPrecio(59.55);

        ArticuloMinorista articulo2 = new ArticuloMinorista();
        articulo2.establecerDescripcion("Jeans de diseñador");
        articulo2.establecerUnidadesDisponibles(30);
        articulo2.establecerPrecio(34.55);

        ArticuloMinorista articulo3 = new ArticuloMinorista();
        articulo3.establecerDescripcion("Camisa");
        articulo3.establecerUnidadesDisponibles(48);
        articulo3.establecerPrecio(24.55);

        System.out.println(articulo1.obtenerDatos());
        System.out.println("-".repeat(100));

        System.out.println(articulo2.obtenerDatos());
        System.out.println("-".repeat(100));

        System.out.println(articulo3.obtenerDatos());
        System.out.println("-".repeat(100));
    }
}
