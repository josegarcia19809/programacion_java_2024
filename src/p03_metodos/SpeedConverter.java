package p03_metodos;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;
        return (long) Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("Invalid value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " +
                toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
