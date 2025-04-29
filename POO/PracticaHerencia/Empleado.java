package POO.PracticaHerencia;

    import java.time.LocalDate;
    public abstract class Empleado {
        protected String dni;
        protected String nombre;
        protected String apellido;
        protected int anio_ingreso;

        public Empleado(String dni, String nombre, String apellido, int anio_ingreso) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.anio_ingreso = anio_ingreso;
        }

        public int antiguedad() {
            int anioActual = LocalDate.now().getYear();
            return anioActual - anio_ingreso;
        }

        public String nombreCompleto() {
            return nombre + " " + apellido;
        }

        public abstract double calcularSalario();
    }

