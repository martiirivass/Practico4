package POO.Practica5.Kata1;

public class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //METODO ASIGNAR TECNICO
    public void asignarTecnico(String tecnico) {
        //se agrega la posibilidad de agregar un tecnico a un ticket
    }

}
