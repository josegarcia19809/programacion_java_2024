package Tienda_Musica_2024;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Cancion> listaCanciones;

    public Catalogo() {
        listaCanciones = new ArrayList<>();
        listaCanciones.add(new Cancion(12, "100 años", "Carlos Rivera y Maluma",
                "Pop", "Sencillo", 25.0, "cien.jpg"));
        listaCanciones.add(new Cancion(32, "Amor prohibido", "Selena",
                "Pop", "Amor prohibido", 10, "amor.jpg"));
        listaCanciones.add(new Cancion(3, "Destino o casualidad", "Melendi y HA-ASH",
                "Pop", "Quitate las gafas", 22, "destino.jpg"));
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public void insertarCancion(Cancion nuevaCancion) {
        listaCanciones.add(nuevaCancion);
    }

    public void verCatalogo() {
        System.out.printf("%-8s|%-30s|%-30s|%-8s\n",
                "Clave", "Nombre canción", "Artista", "Precio");
        System.out.println("-".repeat(80));
        for (Cancion cancion : listaCanciones) {
            System.out.printf("%-8d|%-30s|%-30s|$%-6.2f\n",
                    cancion.getClave(), cancion.getNombreCancion(),
                    cancion.getNombreCantante(), cancion.getPrecio());
        }
    }
}
