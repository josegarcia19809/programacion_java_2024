package ArregloLibros;

public class Main {
    public static void main(String[] args) {
        Libro[] libros = new Libro[3];

        // Agregar los libros
        libros[0] = new Libro("Cien Años", "Gabriel", 700);

        Libro libro1 = new Libro("Don Quijote", "Miguel", 600);
        libros[1] = libro1;

        Libro libro2 = new Libro("Crimen", "Fiodor", 300);
        libros[2] = libro2;

        // Imprimir la lista de libros for
        for (int i = 0; i <= 2; i++) {
            System.out.println(libros[i]);
        }
        System.out.println("-".repeat(100));

        // Imprimir con un for-each
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("-".repeat(100));

        // Cambiar el nombre del autor del libro Cien Años a Anónimo
        libros[0].setAutor("Anónimo");
        imprimirLibros(libros);

        // Cambiar el número de páginas del libro Crimen
        // a 600 e imprimir la lista de libros
        libros[2].setPaginas(600);
        imprimirLibros(libros);

        // Mostrar en pantalla, el titulo y el autor del libro que está
        // en la posición 1: El libro ***** fue escrito por ****
        System.out.println("El libro " + libros[1].getTitulo() +
                " fue escrito por " + libros[1].getAutor());

        // Calcular el total de páginas de todos los libros
        int total = 0;
        for (Libro libro : libros) {
            total += libro.getPaginas();
        }
        System.out.println("Total de páginas de todos los libros: " + total);

    }

    public static void imprimirLibros(Libro[] listaLibros) {
        System.out.println("Lista de libros");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
        System.out.println("-".repeat(100));
    }
}
