package p09_agregacion.CursoLibroDocente;

/**
 * Esta clase almacena datos sobre un curso.
 */

public class Curso {
    private String nombreCurso;     // Nombre del curso
    private Docente docente;        // El docente
    private LibroTexto libroDeTexto; // El libro de texto

    /**
     * Este constructor inicializa el nombreCurso, docente y libroDeTexto.
     *
     * @param nombre  El nombre del curso.
     * @param docente Un objeto Docente.
     * @param libro   Un objeto LibroTexto.
     */

    public Curso(String nombre, Docente docente, LibroTexto libro) {
        // Asignar el nombre del curso.
        nombreCurso = nombre;

        // Asignar al docente.
        this.docente = docente;

        // Asignar el libro de texto.
        libroDeTexto = libro;
    }

    /**
     * Método getNombre
     *
     * @return El nombre del curso.
     */

    public String getNombre() {
        return nombreCurso;
    }

    /**
     * Método getDocente
     *
     * @return el objeto Docente de este curso.
     */

    public Docente getDocente() {
        return this.docente;
    }

    /**
     * Método getLibroTexto
     *
     * @return el objeto LibroTexto de este curso.
     */

    public LibroTexto getLibroTexto() {
        // Retornar una copia del objeto libroDeTexto.
        return this.libroDeTexto;
    }

    /**
     * Método toString
     *
     * @return Una cadena que contiene la información del curso.
     */

    public String toString() {
        // Crear una cadena que represente el objeto.
        String str = "Nombre del curso: " + nombreCurso +
                "\nInformación del docente:\n" + docente +
                "\nInformación del libro de texto:\n" + libroDeTexto;

        // Retornar la cadena.
        return str;
    }
}

