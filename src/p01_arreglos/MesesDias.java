package p01_arreglos;

public class MesesDias {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        // For mejorado
        for (String mes : meses) {
            System.out.println(mes);
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // For mejorado
        for (int dias : diasPorMes) {
            System.out.print(" " + dias);
        }

        System.out.println();
        System.out.println("-".repeat(100));

        // Imprimir ambos datos al mismo tiempo
        for (int i = 0; i < 12; i++) {
            System.out.printf("%s tiene %d días%n",
                    meses[i], diasPorMes[i]);
        }
    }
}
