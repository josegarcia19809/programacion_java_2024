package p09_agregacion.CursoLibroDocente;

public class CursoPrueba {
    public static void main(String[] args) {
        // Crear un objeto Docente.
        Docente miDocente = new Docente("Carlos Pérez", "DC4000");

        // Crear un objeto LibroDeTexto.
        LibroTexto miLibroDeTexto =
                new LibroTexto("Introducción a Java", "Gaddis", "Pearson");

        // Crear un objeto Curso.
        Curso miCurso = new Curso("Introducción a Java", miDocente, miLibroDeTexto);

        // Mostrar la información del curso.
        System.out.println(miCurso);
    }
}
