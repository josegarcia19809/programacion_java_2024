package ArrayListPacientesVeterinaria;

public class PacienteVeterinario {
    private int idPaciente;
    private String nombre;
    private String especie;
    private int edad;
    private String diagnostico;

    public PacienteVeterinario(int idPaciente, String nombre, String especie, int edad,
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
        String salida = String.format("%6d %20s %20s %6d %25s",
                this.idPaciente, this.nombre, this.especie, this.edad, this.diagnostico);
        return salida;
    }

    // Método para guardar en archivo (separado por "|")
    public String formatoArchivo() {
        return idPaciente + "|" + nombre + "|" + especie + "|" + edad + "|" + diagnostico;
    }

    // Método estático para crear un paciente a partir de
    // una línea del archivo
    public static PacienteVeterinario desdeArchivo(String linea) {
        String[] atributos = linea.split("\\|");
        if (atributos.length != 5) {
            throw new IllegalArgumentException("Línea de archivo inválida: " + linea);
        }
        int id = Integer.parseInt(atributos[0]);
        String nombre = atributos[1];
        String especie = atributos[2];
        int edad = Integer.parseInt(atributos[3]);
        String diagnostico = atributos[4];
        return new PacienteVeterinario(id, nombre, especie,
                edad, diagnostico);
    }
}
