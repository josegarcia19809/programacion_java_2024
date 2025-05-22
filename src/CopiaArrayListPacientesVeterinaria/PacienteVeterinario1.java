package CopiaArrayListPacientesVeterinaria;

public class PacienteVeterinario1 {
    private int idPaciente;
    private String nombre;
    private String especie;
    private int edad;
    private String diagnostico;

    public PacienteVeterinario1(int idPaciente, String nombre, String especie, int edad,
                                String diagnostico) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        String salida = String.format("%6d %20s %25s %12d %15s", this.idPaciente, this.nombre,
                this.especie, this.edad, this.diagnostico);
        return salida;
    }

    // Método para guardar en archivo (separado por '|')
    public String formatoArchivo() {
        return idPaciente + "|" + nombre + "|" + especie + "|" + edad + "|" + diagnostico;
    }

    // Método estático para crear un paciente a partir de una línea del archivo
    public static PacienteVeterinario1 desdeArchivo(String linea) {
        String[] partes = linea.split("\\|");
        if (partes.length != 5) {
            throw new IllegalArgumentException("Línea de archivo inválida: " + linea);
        }
        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        String especie = partes[2];
        int edad = Integer.parseInt(partes[3]);
        String diagnostico = partes[4];

        return new PacienteVeterinario1(id, nombre, especie, edad, diagnostico);
    }
}
