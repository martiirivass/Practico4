package POO.Practica5.Kata1;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;
    private static int cantidadTickets = 0;

    public SistemaSoporte(){
        tickets = new ArrayList<>();
    }

    public List<TicketSoporte> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketSoporte> tickets) {
        this.tickets = tickets;
    }

    public static void setCantidadTickets(int cantidadTickets) {
        SistemaSoporte.cantidadTickets = cantidadTickets;
    }

    //crear un nuevo ticket
    public void crearTicket(String descripcion, Estado estado, Usuario usuario) {
        cantidadTickets++;
        TicketSoporte nuevoTicket = new TicketSoporte(cantidadTickets,descripcion,estado);
        nuevoTicket.setUsuario(usuario);
        tickets.add(nuevoTicket);
        System.out.println("Ticket creado: " + nuevoTicket)
        ;
    }
    //asignar tecnico a ticket por id

    public void asignarTecnico(int idTicket, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets){
            if (ticket.getId()==idTicket){
                ticket.asignarTecnico(tecnico);
                System.out.println("Tecnico asignado al ticket ID: " + idTicket + ": " + tecnico.getNombre());
                return;
            }
        }
        System.out.println("Ticket con ID " + idTicket + " no encontrado.");
    }

    // Listar tickets abiertos
    public void listarTicketsAbiertos() {
        System.out.println("\nTickets Abiertos:");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado() == Estado.ABIERTO) {
                System.out.println(ticket);
            }
        }
    }

    // Listar tickets cerrados
    public void listarTicketsCerrados() {
        System.out.println("\nTickets Cerrados:");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado() == Estado.CERRADO) {
                System.out.println(ticket);
            }
        }
    }

    public static int getCantidadTickets() {
        return cantidadTickets;
    }
}
