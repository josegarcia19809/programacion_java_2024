package p00_fundamentos;

public class ConvertidorVelocidad {
    public static void main(String[] args) {
        System.out.println("Convertidor de velocidades");
        System.out.println("KPH\t\t\tMPH");
        System.out.println(".".repeat(20));
        for (int kph = 60; kph <= 130; kph += 10) {
            double mph = kph * 0.6214;
            System.out.printf("%d\t\t\t%.1f%n",
                    kph, mph);
        }
    }
}
