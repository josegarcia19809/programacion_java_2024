package IntegradorGestionVacantes.EmpleadorPaquete;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadorServicio {
    private ArrayList<Empleador> listaEmpleadores = new ArrayList<>();
    private String nombreArchivo;

    public EmpleadorServicio(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarEmpleadoresDesdeArchivo();
    }

    public void cargarEmpleadoresDesdeArchivo() {
        listaEmpleadores.clear();
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                return; // No hay archivo aún
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
                return e;
            }
        }
        return null;
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

    public ArrayList<Empleador> getListaEmpleadores() {
        return listaEmpleadores;
    }
}

