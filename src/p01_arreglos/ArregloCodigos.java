package p01_arreglos;

public class ArregloCodigos {
    public static void main(String[] args) {
        System.out.println("-".repeat(100));
        char[] codigos = {'m', 'u', 'e', 's', 't', 'r', 'a'};
        System.out.println("Cantidad de códigos: " + codigos.length);
        // Mostrar en pantalla
        for (int i = 0; i < codigos.length; i++) {
            System.out.println("Código #" + (i + 1) + ": " + codigos[i]);
        }
    }
}
