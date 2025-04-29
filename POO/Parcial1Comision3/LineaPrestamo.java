package POO.Parcial1Comision3;

import java.time.LocalDate;
import java.util.Date;

public class LineaPrestamo {
    private LocalDate fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    //CONSTRUCTORES


    public LineaPrestamo(LocalDate fechaDevolucionEstimada, Ejemplar ejemplar) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
        this.ejemplar = ejemplar;
    }

    //GETTERS AND SETTERS

    public LocalDate getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(LocalDate fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    //TOTRING


    @Override
    public String toString() {
        return "LineaPrestamo{" +
                "fechaDevolucionEstimada=" + fechaDevolucionEstimada +
                ", ejemplar=" + ejemplar +
                '}';
    }
}
