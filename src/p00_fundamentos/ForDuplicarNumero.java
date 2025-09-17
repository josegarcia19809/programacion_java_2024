package p00_fundamentos;

public class ForDuplicarNumero {
    public static void main(String[] args) {
        System.out.println("Número\t\tDoble");
        System.out.println("-".repeat(20));
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t\t" + (i * 2));
        }
    }
}
