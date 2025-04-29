package POO.Parcial1Comision3;

public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;

    //CONSTRUCTORES

    public Ejemplar(String codigoDePrueba, EstadoEjemplar disponible) {
    }

    public Ejemplar(String codigo, EstadoEjemplar estado, Publicacion publicacion) {
        this.codigo = codigo;
        this.estado = estado;
        this.publicacion = publicacion;
    }

    //GETTERS AND SETTERS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", publicacion=" + publicacion +
                '}';
    }

    //METODO estaDisponible(): boolean
    public boolean estaDisponible() {
        return estado == EstadoEjemplar.DISPONIBLE;
    }

}
