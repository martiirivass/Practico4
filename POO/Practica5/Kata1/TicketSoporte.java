package POO.Practica5.Kata1;

import java.util.Date;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private Estado estado;
    private Date fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte(int id, String descripcion, Estado estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public TicketSoporte(int id, String descripcion, Estado estado, Date fechaCreacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

    public TicketSoporte(int id, String descripcion, Estado estado, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tecnico getTecnico(Tecnico tecnico) {
        return this.tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    //MOSTRAR DETALLE DE TICKET


    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fechaCreacion=" + fechaCreacion +
                ", usuario=" + usuario +
                ", tecnico=" + tecnico +
                '}';
    }

    //METODOS
    public void cerrarTicket(Estado nuevoEstado){
        System.out.println("Cambiando de: " + this.estado + " a nuevo estado: " + nuevoEstado);
        this.estado = nuevoEstado;
    }

    public void asignarTecnico(Tecnico tecnico){
        setTecnico(tecnico);
        System.out.println("El tecnico " + getTecnico(tecnico) + " fue asignado al ticket");
    }


}
