package p08_objetos;

public class RepasoIco2026titulo {
    public static void calcularConsumoGasolina(int lista) {

        int noLista = lista;

        // Distancia base por tramo (km)
        int distanciaBase = noLista * noLista;

        // Kilómetros extra por desvíos
        int kilometrosExtra = noLista + 5;

        // Distancia total recorrida
        int distanciaTotal = distanciaBase + (kilometrosExtra * 2);

        // Datos del vehículo
        int kilometrosPorLitro = 15;
        int capacidadTanque = 60;

        // Cálculos de consumo
        double litrosConsumidos = (double) distanciaTotal / kilometrosPorLitro;
        double porcentajeTanqueUsado = (litrosConsumidos / capacidadTanque) * 100.0;

        // Salidas
        System.out.println("Distancia total recorrida: " + distanciaTotal + " km");
        System.out.printf("Litros consumidos: %.2f%n" , litrosConsumidos);
        System.out.printf("Porcentaje del tanque usado: %.2f%n" ,
                porcentajeTanqueUsado);
    }

    public static void ventasDiarias(int lista) {

        int noLista = lista;

        double[] ventas = {
                350.0, 420.5, 280.0, 500.0,
                390.0, 150.0, 460.0, 295.0 + noLista
        };

        double sumaVentas = 0;
        for (double v : ventas) {
            sumaVentas += v;
        }

        int diasConBajasVentas = 0;
        for (double v : ventas) {
            if (v <= 300.0) {
                diasConBajasVentas += 1;
            }
        }

        System.out.println("Total de ventas: $" + sumaVentas);
        System.out.println("Días con ventas bajas: " + diasConBajasVentas);
    }


    public static void main(String[] args) {
        for (int noLista = 1; noLista <= 3; noLista++) {
            System.out.println(".".repeat(100) + noLista);
            calcularConsumoGasolina(noLista);
            imprimirLinea();
            ventasDiarias(noLista);

            imprimirLinea();
            pruebaCargosGamer(noLista);
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }


    public static void pruebaCargosGamer(int lista) {
        int noLista = lista;
        double saldoInicial = noLista * 60.0;
        int juegosDescargados = noLista * 3;

        CargosGamer cargos = new CargosGamer(saldoInicial, juegosDescargados);

        double saldoAntes = cargos.obtenerSaldoActual();
        double cargosTotales = cargos.obtenerCobroTotal();
        double saldoDespues = cargos.obtenerSaldoActual();

        System.out.println("Saldo antes: " + saldoAntes);
        System.out.println("Cargos totales: " + cargosTotales);
        System.out.println("Saldo despues: " + saldoDespues);
    }

    // Implementación local de imprimirLinea() para mantener el programa autónomo.
    public static void imprimirLinea() {
        System.out.println("--------------------------------------------------");
    }
}

 class CargosGamer {
    private double saldoCuenta;
    private final int juegosDescargados;

    public CargosGamer(double saldoCuenta, int juegosDescargados) {
        this.saldoCuenta = saldoCuenta;
        this.juegosDescargados = juegosDescargados;
    }

    public double obtenerCobroTotal() {
        double tarifaBase = 15.0;
        saldoCuenta -= tarifaBase;

        double costoPorJuegos;
        if (juegosDescargados < 10) {
            costoPorJuegos = juegosDescargados * 2.0;
        } else {
            costoPorJuegos = juegosDescargados * 1.50;
        }

        saldoCuenta -= costoPorJuegos;
        double cargoTotal = tarifaBase + costoPorJuegos;
        return cargoTotal;
    }

    public double obtenerSaldoActual() {
        return saldoCuenta;
    }
}