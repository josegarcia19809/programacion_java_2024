package p08_objetos;


class FacturaGaming {

    private int plan;
    private int horasJugadas;

    public FacturaGaming(int plan, int horasJugadas) {
        this.plan = plan;
        this.horasJugadas = horasJugadas;
    }

    public double calcularPago() {
        double pago = 0.0;

        if (plan == 1) {
            pago = 150.0;
            if (horasJugadas > 15) {
                int extra = horasJugadas - 15;
                pago += extra * 10;
            }
        } else if (plan == 2) {
            pago = 220.0;
            if (horasJugadas > 25) {
                int extra = horasJugadas - 25;
                pago += extra * 8;
            }
        } else if (plan == 3) {
            pago = 300.0;
            if (horasJugadas > 40) {
                int extra = horasJugadas - 40;
                pago += extra * 6;
            }
        }

        return pago;
    }
}

public class FacturaGamingApp {
    public static void main(String[] args) {
        for (int noLista = 1; noLista <=33 ; noLista++) {
            System.out.print("-".repeat(50));
            System.out.println("noLista: "+ noLista);
            int idUsuario = noLista;
            int planUsuario = (idUsuario % 3) + 1;
            int horas = idUsuario * 5;

            FacturaGaming factura = new FacturaGaming(planUsuario, horas);
            double total = factura.calcularPago();

            //System.out.println("Usuario " + idUsuario);
            System.out.println("Horas jugadas: " + horas);
            System.out.println("planUsuario: " + planUsuario);
            System.out.println("Total a pagar: $" + total + " MXN");
            System.out.println();
        }
    }
}
