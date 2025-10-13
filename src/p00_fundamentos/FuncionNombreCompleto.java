package p00_fundamentos;

public class FuncionNombreCompleto {
    public static void mostrarNombreCompleto(
            String nombre, String apellidoP,
            String apellidoM
    ) {
        System.out.println(apellidoP + " " +
                apellidoM + ", " + nombre);
    }

    public static void main(String[] args) {
        mostrarNombreCompleto("José Luis", "García", "Morales");
        mostrarNombreCompleto("Ana María", "Hernández", "López");
    }
}
