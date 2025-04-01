package p06_arreglos_dos_dimensiones;

public class PuntuacionesVideojuegos {
    public static void main(String[] args) {
        final int JUGADORES = 5;
        final int RONDAS = 5;
        int[][] puntuaciones = {
                {1500, 1600, 1550, 1480, 1620},
                {1400, 1450, 1380, 1420, 1460},
                {1700, 1650, 1680, 1720, 1690},
                {1300, 1350, 1320, 1380, 1400},
                {1550, 1580, 1570, 1590, 1600},
        };

        System.out.println("Tabla de puntuaciones");
        for (int i = 0; i < JUGADORES; i++) {
            System.out.print("Jugador #" + (i + 1) + "\t");
            for (int j = 0; j < RONDAS; j++) {
                System.out.printf("%d\t", puntuaciones[i][j]);
            }
            System.out.println();
        }
    }
}
