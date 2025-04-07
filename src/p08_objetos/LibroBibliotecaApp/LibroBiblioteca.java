package p08_objetos.LibroBibliotecaApp;

public class LibroBiblioteca {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Crear el constructor
    public LibroBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Método para obtenerDatos con formato
    public String obtenerDatos() {
        String salida = String.format("%-40s %-40s %10d",
                this.titulo, this.autor, this.anioPublicacion);
        return salida;
    }
}
