package ArrayListPeliculasIMDB;

public class Pelicula {
    private int id;
    private String nombre;
    private String genero;
    private int anio;
    private double calificacionImdb;

    // Constructor
    public Pelicula(int id, String nombre, String genero, int anio, double calificacionImdb) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.calificacionImdb = calificacionImdb;
    }

    // Getters y Setters
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

    public String getGenero() {
        return genero;
    }


    @Override
    public String toString() {
        String nombreLimitado = nombre.length() > 50 ? nombre.substring(0, 50) : nombre;

        return String.format("%-4d | %-50s | %-15s | %-4d | %.1f %n",
                id, nombreLimitado, genero, anio, calificacionImdb);
    }

    public static Pelicula desdeArchivo(String linea) {
        String[] partes = linea.split("\\|");
        int id = Integer.parseInt(partes[0].trim());
        String nombre = partes[1].trim();
        String genero = partes[2].trim();
        int anio = Integer.parseInt(partes[3].trim());
        double calificacion = Double.parseDouble(partes[4].trim());
        return new Pelicula(id, nombre, genero, anio, calificacion);
    }

}

