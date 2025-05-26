package ArrayListVideojuegos;

public class Videojuego {
    private int id;
    private String nombre;
    private String plataforma;
    private int anio;
    private String genero;

    // Constructor
    public Videojuego(int id, String nombre, String plataforma, int anio, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.anio = anio;
        this.genero = genero;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // toString
    @Override
    public String toString() {
        String salida = String.format("%6d %35s %25s %6d %15s",
                this.id, this.nombre, this.plataforma, this.anio, this.genero);
        return salida;
    }

    // Método para guardar en archivo (separado por "|")
    public String formatoArchivo() {
        return id + "|" + nombre + "|" + plataforma + "|" + anio + "|" + genero;
    }

    // Método estático para crear un videojuego a partir de una línea del archivo
    public static Videojuego desdeArchivo(String linea) {
        String[] atributos = linea.split("\\|");
        if (atributos.length != 5) {
            throw new IllegalArgumentException("Línea de archivo inválida: " + linea);
        }

        int id = Integer.parseInt(atributos[0]);
        String nombre = atributos[1];
        String plataforma = atributos[2];
        int anio = Integer.parseInt(atributos[3]);
        String genero = atributos[4];
        return new Videojuego(id, nombre, plataforma, anio, genero);
    }
}
