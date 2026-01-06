package p00_fundamentos;

public class RepasoIco2025 {
    public static void main(String[] args) {
        for (int noLista = 1; noLista <= 17; noLista++) {
            System.out.println(".".repeat(100) + noLista);
            calcularCalorias(noLista);
            imprimirLinea();
            puntuaciones(noLista);

            imprimirLinea();
            pruebaCargosGamer(noLista);
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public static void calcularCalorias(int lista) {
        int noLista = lista;
        int noRebanadas = noLista * noLista;
        int rebanadasExtra = noLista + 3;
        int totalRebanadas = noRebanadas + rebanadasExtra * 3;
        System.out.println(totalRebanadas);

        int porcionesPorPizza = 8;
        int caloriasPorPorcion = 250;

        int caloriasPorPizza = porcionesPorPizza * caloriasPorPorcion;
        double caloriasPorRebanada = (double) caloriasPorPizza / totalRebanadas;

        int rebanadasConsumidas = noRebanadas + 4;
        double caloriasConsumidas = (caloriasPorRebanada * rebanadasConsumidas);

        System.out.println("Calorías por rebanada: " + caloriasPorRebanada);
        System.out.println("Rebanadas consumidas: " + rebanadasConsumidas);
        System.out.println("Calorías consumidas: " + caloriasConsumidas);
    }

    public static void arregloCalorias() {
        int[] calorias = {60, 70, 65, 90};
        for (int caloria : calorias) {
            System.out.println(caloria * 2);
        }

    }

    public static class CargosGamer {
        private double saldoCuenta;
        private final int juegosDescargados;

        public CargosGamer(double saldoCuenta, int juegosDescargados) {
            this.saldoCuenta = saldoCuenta;
            this.juegosDescargados = juegosDescargados;
        }

        public double obtenerCobroTotal() {
            // Tarifa base del servicio
            double tarifaBase = 15.0;
            saldoCuenta -= tarifaBase;

            // Cobro según cantidad de juegos descargados
            double costoPorJuegos;
            if (juegosDescargados < 20) {
                costoPorJuegos = juegosDescargados * 1.50;
            } else {
                costoPorJuegos = juegosDescargados * 1.20;
            }

            saldoCuenta -= costoPorJuegos;
            double cargoTotal = tarifaBase + costoPorJuegos;
            return cargoTotal;
        }

        public double obtenerSaldoActual() {
            return saldoCuenta;
        }
    }

    public static void pruebaCargosGamer(int lista) {
        int noLista = lista;
        double saldoInicial = noLista * 50.0;
        int juegosDescargados = noLista * 2;

        CargosGamer cargos = new CargosGamer(saldoInicial, juegosDescargados);

        double saldoAntes = cargos.obtenerSaldoActual();
        double cargosTotales = cargos.obtenerCobroTotal();
        double saldoDespues = cargos.obtenerSaldoActual();

        System.out.println("Saldo antes: " + saldoAntes);
        System.out.println("Cargos totales: " + cargosTotales);
        System.out.println("Saldo despues: " + saldoDespues);
    }

    public static void puntuaciones(int lista) {
        int noLista = lista;
        double[] calificaciones = {7.5, 9.0, 6.0, 10.0, 8.5, 5.0, 9.5, 4.0, 3.5 + noLista};


        double sumaCalificaciones = noLista;
        for (double cal : calificaciones) {
            sumaCalificaciones += cal;
        }

        int tareasReprobadas = 0;
        for (double cal : calificaciones) {
            if (cal <= 8.0) {
                tareasReprobadas += 1;
            }
        }

        System.out.println("suma Calificaciones: " + sumaCalificaciones);
        System.out.println("Tareas reprobadas: " + tareasReprobadas);
    }

    // Implementación local de imprimirLinea() para mantener el programa autónomo.
    public static void imprimirLinea() {
        System.out.println("--------------------------------------------------");
    }
}
