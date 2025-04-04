package p08_objetos.MascotaApp;

public class MascotaPrueba {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.establecerNombre("Solovino");
        mascota1.establecerAnimal("Perro");
        mascota1.establecerEdad(3);

        Mascota mascota2 = new Mascota();
        mascota2.establecerNombre("Mixi");
        mascota2.establecerAnimal("Gato");
        mascota2.establecerEdad(3);

        System.out.println(mascota1.obtenerDatos());
        System.out.println("-".repeat(100));
        System.out.println(mascota2.obtenerDatos());
    }
}
