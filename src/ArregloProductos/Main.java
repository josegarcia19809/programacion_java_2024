package ArregloProductos;

public class Main {
    public static void main(String[] args) {
        Producto[] inventario = new Producto[3];

        // Ingresar los productos
        inventario[0] = new Producto("Laptop", 1500, 10);

        Producto producto1 = new Producto("Smartphone", 800, 15);
        inventario[1] = producto1;

        Producto producto2 = new Producto("Tablet", 300, 20);
        inventario[2] = producto2;

        // Imprimir el inventario
        for (int i = 0; i <= 2; i++) {
            System.out.println(inventario[i]);
        }
        System.out.println("-".repeat(100));

        // Imprimir con un for mejorado (for-each)
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
        System.out.println("-".repeat(100));

        // Quiero actualizar el nombre del segundo elemento, le quiero poner Celular
        inventario[1].setNombre("Celular");
        imprimirInventario(inventario);

        // Cambiar el precio de la Laptop a $2000
        inventario[0].setPrecio(2000);
        imprimirInventario(inventario);

        // Quiero ver el precio de la tableta:
        // La tablet cuesta 300
        System.out.println("La " + inventario[2].getNombre() + " cuesta " + inventario[2].getPrecio());
        System.out.println("-".repeat(100));

        // Saber el total del inventario
        double total = 0;
        for (int i = 0; i < inventario.length; i++) {
            total += inventario[i].getCantidad() * inventario[i].getPrecio();
        }
        System.out.printf("El inventario es de $%.2f", total);

    }

    public static void imprimirInventario(Producto[] productos) {
        System.out.println("Inventario");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("-".repeat(100));
    }
}
