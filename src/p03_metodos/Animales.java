package p03_metodos;
/*
* Este programa tendrá 6 métodos
* Cada método mostrará el nombre de un animal
* y su emoji
* mostrarGato()
* Y mandarlos llamar desde el método main
* */
public class Animales {
    public static void main(String[] args) {
        mostrarGato();
        mostrarTigre();
    }

    public static void mostrarGato(){
        System.out.println("Gato 🐱");
    }

    public static void mostrarTigre(){
        System.out.println("Tigre 🐯");
    }
}
