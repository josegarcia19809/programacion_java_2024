package IntegradorGestionVacantes.AspirantePaquete;

import IntegradorGestionVacantes.VacantePaquete.Vacante;

import java.io.*;
import java.util.*;

public class AspiranteServicio {
    private ArrayList<Aspirante> listaAspirantes = new ArrayList<>();
    private String archivoAspirantes;
    private Aspirante aspiranteActivo;

    public AspiranteServicio(String archivoAspirantes) {
        this.archivoAspirantes = archivoAspirantes;
        cargarAspirantes();
    }

    private void cargarAspirantes() {
        File archivo = new File(archivoAspirantes);
        if (!archivo.exists()) return;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 5) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    String correo = partes[2];
                    String contrasena = partes[3];
                    String habilidades = partes[4];
                    listaAspirantes.add(new Aspirante(id, nombre, correo, contrasena, habilidades));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar aspirantes: " + e.getMessage());
        }
    }

    private void guardarAspirantes() {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(archivoAspirantes))) {
            for (Aspirante a : listaAspirantes) {
                escritor.println(a.getId() + "|" + a.getNombre() + "|" + a.getCorreo() + "|" +
                        a.getContrasenaHash() + "|" + a.getHabilidades());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar aspirantes: " + e.getMessage());
        }
    }

    public boolean registrarAspirante(String nombre, String correo, String contrasena, String habilidades) {
        for (Aspirante a : listaAspirantes) {
            if (a.getCorreo().equalsIgnoreCase(correo)) return false;
        }

        int nuevoId = listaAspirantes.isEmpty() ? 1 : listaAspirantes.get(listaAspirantes.size() - 1).getId() + 1;
        Aspirante nuevo = new Aspirante(nuevoId, nombre, correo, contrasena, habilidades);
        listaAspirantes.add(nuevo);
        guardarAspirantes();
        return true;
    }

    public Aspirante iniciarSesion(String correo, String contrasena) {
        for (Aspirante a : listaAspirantes) {
            if (a.getCorreo().equalsIgnoreCase(correo) && a.getContrasenaHash().equals(contrasena)) {
                aspiranteActivo = a;
                return a;
            }
        }
        return null;
    }

    public ArrayList<Vacante> leerVacantesDesdeArchivo(String archivoVacantes) {
        ArrayList<Vacante> vacantes = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoVacantes))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 8) {
                    int id = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    String descripcion = partes[2];
                    String habilidades = partes[3];
                    String ubicacion = partes[4];
                    String modalidad = partes[5];
                    double sueldo = Double.parseDouble(partes[6]);
                    int idEmpleador = Integer.parseInt(partes[7]);

                    Vacante vacante = new Vacante(id, titulo, descripcion, habilidades, ubicacion, modalidad, sueldo, idEmpleador);
                    vacantes.add(vacante);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer vacantes: " + e.getMessage());
        }

        return vacantes;
    }

    public void mostrarVacantesDisponibles(ArrayList<Vacante> vacantes) {
        System.out.println("\n--- Vacantes disponibles ---");
        for (Vacante v : vacantes) {
            System.out.printf("ID: %d | Título: %s | Ubicación: %s | Modalidad: %s | Sueldo: %.2f\n",
                    v.getId(), v.getTitulo(), v.getUbicacion(), v.getTipoTrabajo(), v.getSalario());
        }
    }

    // Ver las solicitudes del aspirante activo (sin mostrar su nombre ni ID de la vacante)
    public void verMisSolicitudes(String nombreArchivo) {
        if (aspiranteActivo == null) {
            System.out.println("⚠️ Primero debes iniciar sesión.");
            return;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            boolean encontrado = false;
            System.out.println("\n📋 Vacantes que has solicitado, " + aspiranteActivo.getNombre() + ":");
            System.out.println("-".repeat(60));
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 4 && partes[0].trim().equalsIgnoreCase(aspiranteActivo.getNombre())) {
                    String habilidades = partes[1].trim();
                    String tituloVacante = partes[2].trim();
                    System.out.printf("🔹 Vacante: %-25s | Habilidades: %s%n", tituloVacante, habilidades);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("🔍 No has solicitado ninguna vacante aún.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo de solicitudes.");
        }
    }



    public void postularAVacantes(ArrayList<Vacante> vacantesDisponibles) {
        if (aspiranteActivo == null) {
            System.out.println("⚠️ Debes iniciar sesión como aspirante para postularte.");
            return;
        }

        if (vacantesDisponibles.isEmpty()) {
            System.out.println("⚠️ No hay vacantes disponibles actualmente.");
            return;
        }

        mostrarVacantesDisponibles(vacantesDisponibles);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngresa los IDs de las vacantes a las que deseas postularte (separados por comas): ");
        String entrada = sc.nextLine();

        String[] partes = entrada.split(",");
        HashSet<Integer> idsSeleccionados = new HashSet<>();

        for (String parte : partes) {
            try {
                int id = Integer.parseInt(parte.trim());
                for (Vacante v : vacantesDisponibles) {
                    if (v.getId() == id) {
                        idsSeleccionados.add(id);
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Entrada inválida: " + parte.trim());
            }
        }

        if (idsSeleccionados.isEmpty()) {
            System.out.println("⚠️ No se seleccionó ninguna vacante válida.");
            return;
        }

        try (PrintWriter escritor = new PrintWriter(new FileWriter("solicitudes.txt", true))) {
            for (int id : idsSeleccionados) {
                for (Vacante v : vacantesDisponibles) {
                    if (v.getId() == id) {
                        String linea = String.format("%s, %s, %s, %d",
                                aspiranteActivo.getNombre(),
                                aspiranteActivo.getHabilidades(),
                                v.getTitulo(),
                                v.getId());
                        escritor.println(linea);
                    }
                }
            }
            System.out.println("✅ Solicitudes registradas correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar las solicitudes: " + e.getMessage());
        }
    }

    public Aspirante getAspiranteActivo() {
        return aspiranteActivo;
    }
}
