package p08_objetos.LibroBibliotecaApp;

public class LibroBibliotecaPrueba {
    public static void main(String[] args) {
        LibroBiblioteca libro1 = new LibroBiblioteca("Cien años de Soledad",
                "Gabriel García Marquez", 1967);
        LibroBiblioteca libro2 = new LibroBiblioteca("El principito",
                "Antoine de Saint-Exupery", 1943);
        LibroBiblioteca libro3 = new LibroBiblioteca("Don Quijote de la Mancha",
                "Miguel de Cervantes", 1695);

        // Mostrar los libros
        System.out.printf("%-40s %-40s %10s%n", "Titulo", "Autor", "Año");
        System.out.println("-".repeat(100));
        System.out.println(libro1.obtenerDatos());
        System.out.println(libro2.obtenerDatos());
        System.out.println(libro3.obtenerDatos());

    }
}
