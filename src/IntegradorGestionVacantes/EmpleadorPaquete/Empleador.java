package IntegradorGestionVacantes.EmpleadorPaquete;

public class Empleador {
    private int id;
    private String nombre;
    private String correo;
    private String contrasenaHash;
    private String empresa;

    // Constructor
    public Empleador(int id, String nombre, String correo, String contrasenaHash,
                     String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenaHash = contrasenaHash;
        this.empresa = empresa;
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
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenaHash() {
        return contrasenaHash;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        String salida = String.format("%6d %20s %25s %12s %15s", this.id, this.nombre,
                this.correo, this.contrasenaHash, this.empresa);
        return salida;
    }

    // Método para guardar en archivo (separado por '|')
    public String formatoArchivo() {
        return id + "|" + nombre + "|" + correo + "|" + contrasenaHash + "|" + empresa;
    }

    // Método estático para crear un empleador a partir de una línea del archivo
    public static Empleador desdeArchivo(String linea) {
        String[] partes = linea.split("\\|");
        if (partes.length != 5) {
            throw new IllegalArgumentException("Línea de archivo inválida: " + linea);
        }
        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        String correo = partes[2];
        String contrasenaHash = partes[3];
        String empresa = partes[4];

        return new Empleador(id, nombre, correo, contrasenaHash, empresa);
    }
}
