package POO.Parcial1Comision3;

import java.util.List;

public class Usuario {
    private String nombre, apellido, dni;
    private List<Prestamo> prestamos;
    //CONSTRUCTORES


    public Usuario(String nombre, String apellido, String dni, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = prestamos;
    }

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    //Metodo Historial de prestamos
    public void mostrarHistorialPrestamos() {
        System.out.println("Historial de préstamos de " + nombre + " " + apellido + ":");
        for (Prestamo prestamo : prestamos) {
            System.out.println("Fecha de préstamo: " + prestamo.getFechaPrestamo());
            for (LineaPrestamo linea : prestamo.getLineas()) {
                Ejemplar ejemplar = linea.getEjemplar();
                System.out.println("- Código del ejemplar: " + ejemplar.getCodigo());
                System.out.println("  Fecha de devolución estimada: " + linea.getFechaDevolucionEstimada());
            }
        }
    }
}
