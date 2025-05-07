package p08_objetos.NominaApp;

public class Nomina {
    private int horasTrabajadas;
    private double pagoPorHora;

    public Nomina(int horasTrabajadas, double pagoPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public double calcularSalarioBruto() {
        int horasExtra = 0;
        double pagoBrutoTotal = 0;
        // Horas extras se pagan a 1.5 veces
        if (horasTrabajadas > 40) {
            horasExtra = horasTrabajadas - 40;
            double salarioNormal = 40 * pagoPorHora;
            double salarioExtra = horasExtra * (pagoPorHora * 1.5);
            pagoBrutoTotal = salarioNormal + salarioExtra;
        } else {
            // Horas normales a sueldo normal
            pagoBrutoTotal = horasTrabajadas * pagoPorHora;
        }
        return pagoBrutoTotal;

    }
}
