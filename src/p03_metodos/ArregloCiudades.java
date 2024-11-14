package p03_metodos;

public class ArregloCiudades {
    // Llenar un arreglo con ciudades y devolverlo
    public static String[] obtenerCiudades() {
        String[] ciudades = {"Ciudad de México", "Paris", "Londres", "Tokio",
                "Rio de Janeiro", "Moscú"};
        return ciudades;
    }

    // Pasar un arreglo como parámetro para imprimirlo
    public static void imprimirCiudades(String[] listaCiudades) {
        System.out.println("-".repeat(100));
        System.out.println("Ciudades:");
        for (String ciudad : listaCiudades) {
            System.out.println(ciudad);
        }
        System.out.println("-".repeat(100));
    }

    public static void main(String[] args) {
        String[] ciudades = obtenerCiudades();
        imprimirCiudades(ciudades);
    }
}
