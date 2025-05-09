package p08_objetos.VentasSoftwareApp;

public class VentasSoftware {
    private int unidadesVendidas;

    public VentasSoftware(int unidades) {
        this.unidadesVendidas = unidades;
    }

    public double obtenerTotalVenta() {
        final double precioPaquete = 99.00;
        double porcentajeDescuento = 0;
        if (unidadesVendidas >= 10 && unidadesVendidas <= 19) {
            porcentajeDescuento = 20;
        } else if (unidadesVendidas >= 20 && unidadesVendidas <= 49) {
            porcentajeDescuento = 30;
        } else if (unidadesVendidas >= 50 && unidadesVendidas <= 99) {
            porcentajeDescuento = 40;
        } else if (unidadesVendidas >= 100) {
            porcentajeDescuento = 50;
        }
        double totalVenta = unidadesVendidas * precioPaquete -
                (unidadesVendidas * precioPaquete) * porcentajeDescuento / 100.0;
        return totalVenta;
    }
}
