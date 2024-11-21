package Tienda_Musica_2024;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Cancion> listaCanciones;

    public Catalogo() {
        listaCanciones = new ArrayList<>();
        listaCanciones.add(new Cancion(12, "100 años", "Carlos Rivera y Maluma",
                "Pop", "Sencillo", 25.0, "cien.jpg",
                "https://youtu.be/Pw4y-Q7moGY?si=kpxuFo5LgDkwaSjL"));
        listaCanciones.add(new Cancion(32, "Amor prohibido", "Selena",
                "Pop", "Amor prohibido", 10, "amor.jpg", "enlace"));
        listaCanciones.add(new Cancion(3, "Destino o casualidad", "Melendi y HA-ASH",
                "Pop", "Quitate las gafas", 22, "destino.jpg", "enlace"));
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

    public Cancion buscarPorClave(int clave) {
        for (Cancion cancion : listaCanciones) {
            if (cancion.getClave() == clave) {
                return cancion;
            }
        }
        return null;
    }
}

