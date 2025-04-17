package p09_agregacion.CursoLibroDocente;

/**
 Esta clase almacena datos sobre un libro de texto.
 */

public class LibroTexto
{
    private String titulo;     // Título del libro
    private String autor;      // Apellido del autor
    private String editorial;  // Nombre de la editorial

    /**
     Este constructor inicializa los campos:
     título, autor y editorial.
     @param tituloTexto El título del libro.
     @param aut El nombre del autor.
     @param edit El nombre de la editorial.
     */
    public LibroTexto(String tituloTexto, String aut, String edit)
    {
        this.titulo = tituloTexto;
        this.autor = aut;
        this.editorial = edit;
    }

    /**
     Método getTitulo devuelve el título del libro.
     @return El título del libro.
     */
    public String getTitulo()
    {
        return this.titulo;
    }

    /**
     Método getAutor devuelve el autor del libro.
     @return El autor del libro.
     */
    public String getAutor()
    {
        return this.autor;
    }

    /**
     Método getEditorial devuelve la editorial del libro.
     @return La editorial del libro.
     */
    public String getEditorial()
    {
        return this.editorial;
    }

    /**
     Método toString
     @return Una cadena con la información del libro de texto.
     */
    public String toString()
    {
        // Crear una cadena que representa el objeto.
        String str = "Título: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nEditorial: " + this.editorial;

        // Devolver la cadena.
        return str;
    }
}

