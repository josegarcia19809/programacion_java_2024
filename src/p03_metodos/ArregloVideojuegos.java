package p03_metodos;

public class ArregloVideojuegos {
    public static String[] obtenerVideojuegos() {
        String[] videojuegos = {"The legend of Zelda", "God of war", "Halo infinite",
                "Minecraft", "Fortnite"
        };
        return videojuegos;
    }

    public static void imprimirArreglo(String[] arregloVideojuegos) {
        System.out.println("-".repeat(100));
        System.out.println("Videojuegos:");
        for (String juego : arregloVideojuegos) {
            System.out.println("\t" + juego);
        }
    }

    public static void main(String[] args) {
        String[] videojuegos = obtenerVideojuegos();
        imprimirArreglo(videojuegos);
    }
}
