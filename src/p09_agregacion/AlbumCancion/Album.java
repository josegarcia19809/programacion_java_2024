package p09_agregacion.AlbumCancion;

public class Album {
    private String nombre;
    private String artista;
    private String genero;
    private Cancion cancion1;
    private Cancion cancion2;

    // Constructor
    public Album(String nombre, String artista, String genero, Cancion c1, Cancion c2) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.cancion1 = c1;
        this.cancion2 = c2;
    }

    // Métodos get
    public String getNombre() {
        return this.nombre;
    }

    public String getArtista() {
        return this.artista;
    }

    public String getGenero() {
        return this.genero;
    }

    public Cancion getCancion1() {
        return this.cancion1;
    }

    public Cancion getCancion2() {
        return this.cancion2;
    }

    @Override
    public String toString() {
        String salida = "ÁLBUM\n";
        salida += "Nombre: " + this.getNombre() + "\n";
        salida += "Artista: " + this.getArtista() + "\n";
        salida += "Género: " + this.getGenero() + "\n";
        return salida;
    }
}
