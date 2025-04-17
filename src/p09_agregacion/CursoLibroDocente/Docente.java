package p09_agregacion.CursoLibroDocente;

/**
 Esta clase almacena datos sobre un docente.
 */

public class Docente
{
    private String nombre;           // Nombre
    private String numeroOficina;    // Número de oficina

    /**
     Este constructor inicializa los campos.
     @param nombre El nombre del docente.
     @param oficina El número de oficina.
     */
    public Docente(String nombre, String oficina)
    {
        this.nombre = nombre;
        this.numeroOficina = oficina;
    }

    /**
     Método getNombre devuelve el nombre del docente.
     @return El campo nombre.
     */
    public String getNombre()
    {
        return this.nombre;
    }

    /**
     Método getNumeroOficina devuelve el número de oficina del docente.
     @return El número de oficina del docente.
     */
    public String getNumeroOficina()
    {
        return this.numeroOficina;
    }

    /**
     Método toString
     @return Una cadena con la información del docente.
     */
    public String toString()
    {
        // Crear una cadena que representa el objeto.
        String str = "Nombre: " + this.nombre + "\nNúmero de Oficina: " +
                this.numeroOficina;

        // Devolver la cadena.
        return str;
    }
}

