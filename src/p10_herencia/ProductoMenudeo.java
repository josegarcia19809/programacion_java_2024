package p10_herencia;

public class ProductoMenudeo extends Producto {
    private int porcentajeAumento;

    public ProductoMenudeo(String nombre, double precio, int cantidad,
                           int porcentajeAumento) {
        super(nombre, precio, cantidad);
        this.porcentajeAumento = porcentajeAumento;
    }

    public int getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(int porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", porcentajeAumento=" + porcentajeAumento;
    }
}
