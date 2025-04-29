package POO.Practica5.Kata1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        Usuario usuario1 = new Usuario(1,"Ana López");
        Usuario usuario2 = new Usuario(2,"Pedro Martínez");

        Tecnico tecnico1 = new Tecnico(1, "Laura Torres", "Hardware");
        Tecnico tecnico2 = new Tecnico(2, "José Rivera", "Software");

        // Crear tickets
        sistema.crearTicket("No arranca la computadora", Estado.ABIERTO, usuario1);
        sistema.crearTicket("Error en el programa de contabilidad", Estado.ABIERTO, usuario2);

        // Asignar técnicos
        sistema.asignarTecnico(1, tecnico1);
        sistema.asignarTecnico(2, tecnico2);

        // Listar tickets abiertos
        sistema.listarTicketsAbiertos();

        // Cambiar estado de un ticket a cerrado
        TicketSoporte ticket1 = sistema.getTickets().get(0); // Accedemos al primer ticket
        ticket1.cerrarTicket(Estado.CERRADO);

        // Listar tickets cerrados
        sistema.listarTicketsCerrados();

        // Mostrar cantidad total de tickets creados
        System.out.println("\nCantidad de tickets creados: " + SistemaSoporte.getCantidadTickets());
    }
}


