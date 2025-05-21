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
}
