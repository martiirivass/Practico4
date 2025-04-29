package POO.Parcial1Comision3;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private String titulo;
    private int anio;
    private List<Ejemplar> ejemplares;
    private Genero genero;
    //CONSTRUCTORES

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public Publicacion(String titulo, int anio, List<Ejemplar> ejemplares, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.genero = genero;
    }

    //GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", ejemplares=" + ejemplares +
                ", genero=" + genero +
                '}';
    }


    //get ejemplaresDisponibles(): List<Ejemplar>

        public List<Ejemplar> getEjemplaresDisponibles() {
            List<Ejemplar> disponibles = new ArrayList<>();
            for (Ejemplar e : ejemplares) {
                if (e.estaDisponible()) {
                    disponibles.add(e);
                }
            }
            return disponibles;
        }
}
