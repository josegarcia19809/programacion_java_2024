package p09_agregacion.AlbumCancion;

import java.util.Scanner;

public class PruebaAlbum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombreCancionx, duracionx;
        double preciox;

        // Pedir datos de la canción 1
        System.out.println("Canción 1");
        System.out.print("Nombre: ");
        nombreCancionx = entrada.nextLine();

        System.out.print("Duración: ");
        duracionx = entrada.nextLine();

        System.out.print("Precio: ");
        preciox = entrada.nextDouble();
        entrada.nextLine();

        Cancion cancion1 = new Cancion(nombreCancionx, duracionx, preciox);

        System.out.println(".".repeat(60));


        // Pedir datos de la canción 2
        System.out.println("Canción 2");
        System.out.print("Nombre: ");
        nombreCancionx = entrada.nextLine();

        System.out.print("Duración: ");
        duracionx = entrada.nextLine();

        System.out.print("Precio: ");
        preciox = entrada.nextDouble();
        entrada.nextLine();

        Cancion cancion2 = new Cancion(nombreCancionx, duracionx, preciox);

        System.out.println(".".repeat(60));
        System.out.println("Pedir datos del álbum");
        System.out.print("Dame nombre: ");
        String nombreAlbum = entrada.nextLine();

        System.out.print("Dame artista: ");
        String artista = entrada.nextLine();

        System.out.print("Dame género: ");
        String genero = entrada.nextLine();

        System.out.println(".".repeat(60));
        Album miAlbumFavorito = new Album(nombreAlbum, artista, genero, cancion1, cancion2);
        System.out.println("Datos del álbum");
        System.out.println(miAlbumFavorito);

        System.out.println("Canciones");
        System.out.println(miAlbumFavorito.getCancion1());
        System.out.println(miAlbumFavorito.getCancion2());
    }
}
