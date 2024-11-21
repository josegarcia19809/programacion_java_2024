package Tienda_Musica_2024;

public class Cancion {
    private int clave;
    private String nombreCancion;
    private String nombreCantante;
    private String genero;
    private String album;
    private double precio;
    private String portada;
    private String enlace;

    public Cancion(int clave, String nombreCancion, String nombreCantante, String genero,
                   String album, double precio, String portada, String enlace) {
        this.clave = clave;
        this.nombreCancion = nombreCancion;
        this.nombreCantante = nombreCantante;
        this.genero = genero;
        this.album = album;
        this.precio = precio;
        this.portada = portada;
        this.enlace = enlace;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
