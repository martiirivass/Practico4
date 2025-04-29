package POO.Parcial1Comision3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private List<LineaPrestamo> lineas;
    //CONSTRUCTORES


    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, List<LineaPrestamo> lineas) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = lineas;
    }

    public Prestamo(LocalDate now, LocalDate localDate, ArrayList<LineaPrestamo> lineas) {
    }

    //GETTERS AND SETTERS

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List<LineaPrestamo> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaPrestamo> lineas) {
        this.lineas = lineas;
    }


    //TOSTRING

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", lineas=" + lineas +
                '}';
    }
    //agregarLineaPrestamo(e:Ejemplar): void
        public void agregarLineaPrestamo(Ejemplar ejemplar) {
            LocalDate fechaDevolucionEstimada = fechaPrestamo.plusDays(7);
            LineaPrestamo linea = new LineaPrestamo(fechaDevolucionEstimada, ejemplar);
            lineas.add(linea);
        }
    }
