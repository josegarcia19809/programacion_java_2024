package IntegradorGestionVacantes.AspirantePaquete;

public class Aspirante {
    private int id;
    private String nombre;
    private String correo;
    private String contrasenaHash;
    private String habilidades;

    // Constructor
    public Aspirante(int id, String nombre, String correo, String contrasenaHash,
                     String habilidades) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenaHash = contrasenaHash;
        this.habilidades = habilidades;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenaHash() {
        return this.contrasenaHash;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }

    public String getHabilidades() {
        return this.habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        String salida = String.format("%6d %20s %40s %20s %60s",
                this.id, this.nombre, this.correo, this.contrasenaHash, this.habilidades);
        return salida;
    }

}
