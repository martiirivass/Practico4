package POO.Parcial1Comision3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        //Autores
        Autor autor1 = new Autor("Pedro Gonzalez", "Colombiano", LocalDate.of(1977, 6, 6));
        Autor autor2 = new Autor("Mario Bustamante", "Peruano", LocalDate.of(1980, 3, 28));
        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);

        //Direccion
        Direccion direccion = new Direccion("San Martin", "Mendoza", "1234", 12345);

        //Editorial
        Editorial editorial = new Editorial("Editorial Prueba", "https://sitiowebejemplo.com", direccion);

        //Genero
        Genero genero = new Genero("Policial", "Literatura enfocada en las tramas policiales.");

        //Creo libro
        Libro libro = new Libro("Titulo1",1980,genero,"13-245-23",autores,editorial);
        Libro libro2 = new Libro ("Titulo2",2000,genero,"483-889-231",autores,editorial);

        //Ejemplar
        Ejemplar ejemplar = new Ejemplar("codigo de prueba" , EstadoEjemplar.DISPONIBLE);
        Ejemplar ejemplar2 = new Ejemplar("Codiguito",EstadoEjemplar.PRESTADO);
        Ejemplar ejemplar3 = new Ejemplar ("codigo3",EstadoEjemplar.EXTRAVIADO);
        List<Ejemplar> ejemplares1 = new ArrayList<>();
        ejemplares1.add(ejemplar);
        ejemplares1.add(ejemplar2);
        ejemplares1.add(ejemplar3);


        //Instancio revista
        Revista revista = new Revista("Titulo Revista",2000,genero,3,5);
        //Creo ejemplar
        Ejemplar ejemplar1 = new Ejemplar("REV123", EstadoEjemplar.DISPONIBLE, revista);
       //Agrego ejemplar a revista
        revista.getEjemplares().add(ejemplar1);


        //Publicaciones
        Publicacion publicacion = new Publicacion("Titulo de publicacion", 2000, ejemplares1, genero);
        Publicacion publicacion2 = new Publicacion("Publicacion dos", 1999, ejemplares1, genero);
        Publicacion publicacion3= new Publicacion("Publicacion tres", 2007, ejemplares1, genero);
        List<Publicacion> publicaciones1 = new ArrayList<>();
        publicaciones1.add(publicacion);
        publicaciones1.add(publicacion2);
        publicaciones1.add(publicacion3);

        //Usuarios
        Usuario usuario1= new Usuario("Kiki","Rivas","46060235");
        Usuario usuario2= new Usuario ("Brisa","Guiretti","12355123");
        List<Usuario> usuarios1= new ArrayList<>();
        usuarios1.add(usuario1);
        usuarios1.add(usuario2);

        //Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        //Crear prestamo
        // 3. Crear préstamo
        Prestamo prestamo = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(7), new ArrayList<>());
        prestamo.agregarLineaPrestamo(ejemplar);
        usuario1.getPrestamos().add(prestamo);
    }
}
