package POO.PracticaHerencia;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleados(Empleado e){
        this.empleados.add(e);
    }

    public void mostrarSalario(){
        for (Empleado e : empleados){
            System.out.println(e.nombreCompleto() + ": $" + e.calcularSalario());
        }
    }

    public Empleado empleadoConMasClientes(){
        int max = -1;
        Empleado elMayor = null;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoComision){
                EmpleadoComision eac = (EmpleadoComision) e;
                int cant = eac.getCantidadEmpleadosCaptados();
                if (cant > max) {
                    elMayor = e;
                }
            }
        }
        return elMayor;
    }

}
