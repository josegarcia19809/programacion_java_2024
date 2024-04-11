package StreamBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntroduction {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The alchemist", "Paulo Coelho", "Adventure", 4.4));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.1));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.6));
        books.add(new Book("House of Leaves", "Mark Danielewski", "Horror", 4.0));

        System.out.println();
        books.forEach(System.out::println);
        imprimirLinea();

        // Mostrar los libros que sean de genero romance y cuyo rating sea mayor a 3.
        // El resultado se guarda en una lista
        List<Book> popularRomanticBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Romance"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());
        System.out.println("List of Romantic Books with a rating greater than 3.: ");
        popularRomanticBooks.forEach(book -> System.out.println(book));
        imprimirLinea();

        // Mostrar los libros que sean de genero horror y cuyo rating sea menor a 3.
        // El resultado se guarda en una lista y mostrar
        List<Book> popularHorrorBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() < 3)
                .toList();
        System.out.println("List of Horror Books with a rating less than 3.: ");
        popularHorrorBooks.forEach(System.out::println);
        imprimirLinea();

        // Mostrar los libros que sean del autor "Paulo Coelho"
        List<Book> PauloBooks = books.stream()
                .filter(book -> book.getAuthor().equals("Paulo Coelho"))
                .toList();
        System.out.println("List of Paulo's Books: ");
        PauloBooks.forEach(System.out::println);
        imprimirLinea();

        // De los libros, mostrar solo el nombre del autor cuyo rating sea mayor que 3
        System.out.println("Authors whose rating greater than 3.: ");
        books.stream()
                .filter(book -> book.getRating() > 3)
                .map(book -> book.getAuthor())
                .forEach(System.out::println);
        imprimirLinea();

        // Conseguir el rating máximo de toda la lista de libros
        double maxRating = books.stream()
                .mapToDouble(book -> book.getRating())
                .max().getAsDouble();
        System.out.printf("Max rating: %.2f\n", maxRating);
        imprimirLinea();

        // Sacar el promedio de los ratings
        double averageRatings = books.stream()
                .mapToDouble(Book::getRating)
                .average().orElseThrow(IllegalStateException::new);
        System.out.printf("Average rating: %.2f\n", averageRatings);
        imprimirLinea();

        double totalRating = books.stream()
                .mapToDouble(book -> book.getRating())
                .reduce(0.0, (total, rating) -> total + rating);

        int cuentaRatings = (int) books.stream()
                .count();

        System.out.printf("Suma de ratings: %.2f\n", totalRating);
        System.out.printf("Cuenta ratings: %d\n", cuentaRatings);
        System.out.printf("Promedio de ratings: %.2f\n", (totalRating / cuentaRatings));
        imprimirLinea();
    }

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("-".repeat(40));
    }
}
