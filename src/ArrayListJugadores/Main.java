package ArrayListJugadores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList que se llame equipo para guardar Jugadores
        ArrayList<Jugador> equipo = new ArrayList<>();

        // Agregar un jugador
        equipo.add(new Jugador("Messi", 25));

        // Agregar otro jugador usando una variable
        Jugador j1 = new Jugador("Alan", 1);
        equipo.add(j1);

        System.out.println("----------------------------");
        System.out.println("Jugadores:");
        for (int i = 0; i < equipo.size(); i++) {
            System.out.println(equipo.get(i).toString());
        }

        System.out.println("----------------------------");
        // for mejorado
        System.out.println("Jugadores:");
        for (Jugador aux : equipo) {
            System.out.println(aux.toString());
        }
    }
}
