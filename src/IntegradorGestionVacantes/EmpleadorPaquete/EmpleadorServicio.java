package IntegradorGestionVacantes.EmpleadorPaquete;

import IntegradorGestionVacantes.VacantePaquete.Vacante;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmpleadorServicio {
    private ArrayList<Empleador> listaEmpleadores = new ArrayList<>();
    private ArrayList<Vacante> listaVacantes = new ArrayList<>();
    private String nombreArchivo;
    private String archivoVacantes = "vacantes.txt";
    private Empleador empleadorActivo = null;

    public EmpleadorServicio(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarEmpleadoresDesdeArchivo();
        cargarVacantesDesdeArchivo();
    }

    public void cargarEmpleadoresDesdeArchivo() {
        listaEmpleadores.clear();
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                return;
            }
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                Empleador empleador = Empleador.desdeArchivo(linea);
                listaEmpleadores.add(empleador);
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarEmpleadoresEnArchivo() {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivo);
            for (Empleador e : listaEmpleadores) {
                escritor.println(e.formatoArchivo());
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public boolean registrarEmpleador(String nombre, String correo, String contrasena, String empresa) {
        if (correoExiste(correo)) {
            return false;
        }
        int nuevoId = obtenerNuevoId();
        Empleador nuevo = new Empleador(nuevoId, nombre, correo, contrasena, empresa);
        listaEmpleadores.add(nuevo);
        guardarEmpleadoresEnArchivo();
        return true;
    }

    public Empleador iniciarSesion(String correo, String contrasena) {
        for (Empleador e : listaEmpleadores) {
            if (e.getCorreo().equals(correo) && e.getContrasenaHash().equals(contrasena)) {
                empleadorActivo = e;
                return e;
            }
        }
        return null;
    }

    public void cerrarSesion() {
        empleadorActivo = null;
    }

    public boolean correoExiste(String correo) {
        for (Empleador e : listaEmpleadores) {
            if (e.getCorreo().equals(correo)) {
                return true;
            }
        }
        return false;
    }

    private int obtenerNuevoId() {
        int max = 0;
        for (Empleador e : listaEmpleadores) {
            if (e.getId() > max) {
                max = e.getId();
            }
        }
        return max + 1;
    }

    private int obtenerNuevoIdVacante() {
        int max = 0;
        for (Vacante v : listaVacantes) {
            if (v.getId() > max) {
                max = v.getId();
            }
        }
        return max + 1;
    }

    public void agregarVacante(String titulo, String descripcion, String requisitos,
                               String ubicacion, String tipoTrabajo, double salario) {
        if (empleadorActivo == null) {
            System.out.println("Debe iniciar sesión para agregar una vacante.");
            return;
        }

        int nuevoId = obtenerNuevoIdVacante();
        Vacante nueva = new Vacante(nuevoId, titulo, descripcion, requisitos,
                ubicacion, tipoTrabajo, salario, empleadorActivo.getId());
        listaVacantes.add(nueva);
        guardarVacantesEnArchivo();
        System.out.println("Vacante agregada correctamente.");
    }

    public void verVacantesDelEmpleadorActivo() {
        if (empleadorActivo == null) {
            System.out.println("Debe iniciar sesión para ver sus vacantes.");
            return;
        }

        System.out.println("Vacantes publicadas por: " + empleadorActivo.getNombre() +
                " de la empresa " + empleadorActivo.getEmpresa());
        System.out.printf("%4s %25s %30s %25s %20s %20s %12s %10s%n",
                "id", "Titulo", "Descripción", "Requisitos", "Ubicacion", "Tipo de Trabajo",
                "Salario", "PIN");
        System.out.println("...".repeat(70));
        for (Vacante v : listaVacantes) {
            if (v.getIdEmpleador() == empleadorActivo.getId()) {
                System.out.println(v);
            }
        }
    }

    public void verSolicitudesRecibidas(String archivoSolicitudes, String archivoVacantes) {
        if (empleadorActivo == null) {
            System.out.println("⚠️ Debes iniciar sesión como empleador.");
            return;
        }

        int idEmpleador = empleadorActivo.getId();  // 🔍 ahora usamos el ID del empleador
        Set<Integer> idsVacantesDelEmpleador = new HashSet<>();

        // 1. Leer las vacantes publicadas por este empleador
        try (BufferedReader br = new BufferedReader(new FileReader(archivoVacantes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length >= 8) {
                    int idVacante = Integer.parseInt(partes[0]);
                    int idEmpleadorVacante = Integer.parseInt(partes[7]);  // última columna: id empleador

                    if (idEmpleadorVacante == idEmpleador) {
                        idsVacantesDelEmpleador.add(idVacante);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo de vacantes.");
            return;
        }

        // 2. Leer las solicitudes y comparar con vacantes del empleador
        boolean encontrado = false;
        System.out.println("\n📥 Solicitudes recibidas para el empleador: " + empleadorActivo.getNombre());
        System.out.println("-".repeat(100));

        try (BufferedReader br = new BufferedReader(new FileReader(archivoSolicitudes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 4) {
                    String nombreAspirante = partes[0].trim();
                    String habilidades = partes[1].trim();
                    String tituloVacante = partes[2].trim();
                    int idVacante = Integer.parseInt(partes[3].trim());

                    if (idsVacantesDelEmpleador.contains(idVacante)) {
                        System.out.printf("🧑 Aspirante: %-20s | Habilidades: %-30s%n", nombreAspirante, habilidades);
                        System.out.printf("📌 Vacante:   %-20s | ID: %-5d%n", tituloVacante, idVacante);
                        System.out.println("-".repeat(100));
                        encontrado = true;
                    }
                }
            }

            if (!encontrado) {
                System.out.println("📭 No hay solicitudes aún para tus vacantes.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo de solicitudes.");
        }
    }



    public void guardarVacantesEnArchivo() {
        try {
            File archivo = new File(archivoVacantes);
            PrintWriter escritor = new PrintWriter(archivo);
            for (Vacante v : listaVacantes) {
                escritor.printf("%d|%s|%s|%s|%s|%s|%.2f|%d\n",
                        v.getId(), v.getTitulo(), v.getDescripcion(),
                        v.getRequisitos(), v.getUbicacion(), v.getTipoTrabajo(),
                        v.getSalario(), v.getIdEmpleador());
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error al guardar las vacantes: " + e.getMessage());
        }
    }

    public void cargarVacantesDesdeArchivo() {
        listaVacantes.clear();
        try {
            File archivo = new File(archivoVacantes);
            if (!archivo.exists()) {
                return;
            }
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] partes = linea.split("\\|");
                if (partes.length == 8) {
                    int id = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    String descripcion = partes[2];
                    String requisitos = partes[3];
                    String ubicacion = partes[4];
                    String tipoTrabajo = partes[5];
                    double salario = Double.parseDouble(partes[6]);
                    int idEmpleador = Integer.parseInt(partes[7]);
                    Vacante vacante = new Vacante(id, titulo, descripcion, requisitos,
                            ubicacion, tipoTrabajo, salario, idEmpleador);
                    listaVacantes.add(vacante);
                }
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al cargar vacantes: " + e.getMessage());
        }
    }

    public ArrayList<Empleador> getListaEmpleadores() {
        return listaEmpleadores;
    }

    public ArrayList<Vacante> getListaVacantes() {
        return listaVacantes;
    }

    public Empleador getEmpleadorActivo() {
        return empleadorActivo;
    }
}
