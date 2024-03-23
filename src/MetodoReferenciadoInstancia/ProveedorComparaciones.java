package MetodoReferenciadoInstancia;

import MetodoEstaticoReferenciado.Persona;

public class ProveedorComparaciones {
    public int compararPorNombre(Persona persona1, Persona persona2) {
        return persona1.getNombre().compareTo(persona2.getNombre());
    }

    public int compararPorEdad(Persona a, Persona b) {
        return a.getEdad().compareTo(b.getEdad());
    }
}
