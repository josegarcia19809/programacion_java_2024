package ArrayListVideojuegos;

import java.util.ArrayList;

public class VideojuegosOperaciones {
    ArrayList<Videojuego> juegos = new ArrayList<>();

    // Constructor
    public VideojuegosOperaciones() {
        juegos.add(new Videojuego(401, "The Legend of Zelda", "Nintendo", 2017, "Aventura"));
        juegos.add(new Videojuego(402, "God of War", "PlayStation", 2018, "Acción"));
        juegos.add(new Videojuego(403, "Minecraft", "Multiplataforma", 2011, "Sandbox"));
        juegos.add(new Videojuego(404, "Animal Crossing", "Nintendo", 2020, "Simulación"));
        juegos.add(new Videojuego(405, "Halo Infinite", "Xbox", 2021, "Disparos"));
        juegos.add(new Videojuego(406, "Elden Ring", "Multiplataforma", 2022, "RPG"));
        juegos.add(new Videojuego(407, "Spider-Man: Miles Morales", "PlayStation", 2020,
                "Aventura"));
    }

    public void agregarVideojuego(Videojuego nuevoJuego) {
        juegos.add(nuevoJuego);
    }

    private void imprimirLineaPuntos() {
        System.out.println(".".repeat(100));
    }

    private void mostrarVideojuegos(ArrayList<Videojuego> listaJuegos) {
        imprimirLineaPuntos();
        String salida = String.format("%6s %35s %25s %6s %15s",
                "id", "nombre", "plataforma", "año", "genero");
        System.out.println(salida);
        imprimirLineaPuntos();
        for (int i = 0; i < listaJuegos.size(); i++) {
            System.out.println(listaJuegos.get(i));
        }
    }

    public void mostrarTodosLosVideojuegos(){
        mostrarVideojuegos(juegos);
    }

}
