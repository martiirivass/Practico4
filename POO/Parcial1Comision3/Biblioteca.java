package POO.Parcial1Comision3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    //CONSTRUCTORES


    public Biblioteca(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Biblioteca() {
    }

    public Biblioteca(List<Publicacion> publicaciones, List<Usuario> usuarios) {
        this.publicaciones = publicaciones;
        this.usuarios = usuarios;
    }

    //GETTERS AND SETTERS

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Biblioteca{" +
                "publicaciones=" + publicaciones +
                ", usuarios=" + usuarios +
                '}';
    }
}
