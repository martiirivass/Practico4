package POO.Parcial1Comision3;

import java.time.LocalDate;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    //CONSTRUCTORES, SOBRECARGA DE CONSTRUCTORES.
    public Autor() {
    }
    public Autor(String nombre, String nacionalidad) {
        setNombre(nombre);
        this.nacionalidad = nacionalidad;
    }

    public Autor(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        setNombre(nombre);
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else throw new IllegalArgumentException("El nombre no puede ser nulo.");
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
