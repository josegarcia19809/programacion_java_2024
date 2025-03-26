package p01_arreglos;

public class ArregloGoles {
    public static void main(String[] args) {

        int[] goles = {2, 3, 4, 12, 1, 0};
        System.out.println("Cantidad de equipos: " + goles.length);
        System.out.println("-".repeat(100));

        for (int i = 0; i < goles.length; i++) {
            System.out.println("Goles del " + "equipo #" + (i + 1) + ": " + goles[i]);
        }
    }
}
