package POO.PracticaHerencia;

public class EmpleadoSalarioFijo extends Empleado {

        private static final double POR1 = 0.05;
        private static final double PORC2 = 0.10;
        private static final int anio1 = 2;
        private static final int anio2 = 5;
        private double sueldoBasico;


        public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anio_ingreso, double sb) {
            super(dni, nombre, apellido, anio_ingreso);
            this.sueldoBasico = sb;
        }

        public double porcAdicional(){
            int ant = antiguedad();
            double porc = 0;
            if (ant > anio2){
                porc = PORC2;
            } else if (ant >= anio1) {
                porc = POR1;
            }
            return porc;
        }


        @Override
        public double calcularSalario() {
            return sueldoBasico + sueldoBasico * porcAdicional();
        }
    }
