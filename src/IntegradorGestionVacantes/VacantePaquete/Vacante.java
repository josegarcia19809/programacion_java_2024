package IntegradorGestionVacantes.VacantePaquete;

public class Vacante {
    private int id;
    private String titulo;
    private String descripcion;
    private String requisitos;
    private String ubicacion;
    private String tipoTrabajo;
    private double salario;

    // Constructor
    public Vacante(int id, String titulo, String descripcion, String requisitos,
                   String ubicacion, String tipoTrabajo, double salario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.requisitos = requisitos;
        this.ubicacion = ubicacion;
        this.tipoTrabajo = tipoTrabajo;
        this.salario = salario;
    }

    // métodos set y get
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String salida = String.format("%4d %25s %30s %25s %20s %20s %12.2f",
                this.id, this.titulo, this.descripcion,
                this.requisitos.substring(0, 18) + "...",
                this.ubicacion, this.tipoTrabajo, this.salario);
        return salida;
    }
}
