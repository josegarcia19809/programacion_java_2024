package p00_fundamentos;

public class FuncionSaludar {
    public static void saludar(String nombre) {
        System.out.println("Hola, amigo(a) " +
                nombre);
    }

    public static void main(String[] args) {
        saludar("José");
        saludar("Carlos");
        saludar("Sofía");
        saludar("María");
    }
}
