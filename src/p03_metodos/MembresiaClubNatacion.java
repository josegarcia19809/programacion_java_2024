package p03_metodos;

/*
 * Escribe un programa que tenga métodos para mostrar la siguiente información:
 * Nombre del miembro: mostrarNombre()
 * Tarifas de membresía: mostrarTarifas()
 * Fecha de registro: verFechaRegistro()
 * Fecha de caducidad: verFechaCaducidad()
 * Mandar llamar a los métodos
 * */
public class MembresiaClubNatacion {
    public static void main(String[] args) {
        System.out.println("Membresia club de natación");
        System.out.println("Bienvenido");
        mostrarNombre();
        mostrarTarifas();
        verFechaRegistro();
        verFechaCaducidad();
    }

    public static void mostrarNombre() {
        System.out.println("José L García");
        imprimirLinea();
    }

    public static void mostrarTarifas() {
        System.out.println("Tarifas:");
        System.out.println("Niños: $300.00");
        System.out.println("Jóvenes: $600.00");
        System.out.println("Adultos: $800.00");
        imprimirLinea();
    }

    public static void verFechaRegistro() {
        System.out.println("Fecha de registro:");
        System.out.println("25/09/2020");
        imprimirLinea();
    }

    public static void verFechaCaducidad() {
        System.out.println("Fecha de caducidad:");
        System.out.println("27/09/2024");
        imprimirLinea();
    }

    public static void imprimirLinea() {
        System.out.println("-".repeat(100));
    }

}
