package p01_arreglos;

public class ArregloNombresComunes {
    public static void main(String[] args) {
        final int PERSONAS = 4;
        String[] nombres = new String[PERSONAS];
        nombres[0] = "Carlos";
        nombres[1] = "Susana";
        nombres[2] = "Jorge";
        nombres[3] = "Andrea";

        // Imprimir en pantalla con un for mejorado
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
