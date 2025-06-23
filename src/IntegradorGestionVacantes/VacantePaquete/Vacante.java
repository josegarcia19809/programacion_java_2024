package IntegradorGestionVacantes.VacantePaquete;

public class Vacante {
    private int id;
    private String titulo;
    private String descripcion;
    private String requisitos;
    private String ubicacion;
    private String tipoTrabajo;
    private double salario;
    private int idEmpleador; // Nuevo campo

    // Constructor actualizado
    public Vacante(int id, String titulo, String descripcion, String requisitos,
                   String ubicacion, String tipoTrabajo, double salario, int idEmpleador) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.requisitos = requisitos;
        this.ubicacion = ubicacion;
        this.tipoTrabajo = tipoTrabajo;
        this.salario = salario;
        this.idEmpleador = idEmpleador;
    }

    // Métodos set y get
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

    public int getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(int idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    @Override
    public String toString() {
        String descripcionX = this.descripcion.length() > 25 ?
                this.descripcion.substring(0, 25) + "..." : this.descripcion;
        String requisitosX = this.requisitos.length() > 18 ?
                this.requisitos.substring(0, 18) + "..." : this.requisitos;
        String salida = String.format("%4d %25s %30s %25s %20s %20s %12.2f %10d",
                this.id, this.titulo,
                descripcionX, requisitosX,
                this.ubicacion, this.tipoTrabajo, this.salario, this.idEmpleador);
        return salida;
    }
}
