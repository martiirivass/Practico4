package POO.Parcial1Comision3;

public class Genero {
    private String nombre, descripcion;

    //CONSTRUCTORES

    public Genero(String nombre, String descripcion) {
        setNombre(nombre);
        this.descripcion = descripcion;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else throw new IllegalArgumentException("El nombre no puede ser nulo");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //TOSTRING


    @Override
    public String toString() {
        return "Genero{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
