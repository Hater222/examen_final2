package Ejercicio02ex;
//NO ME FUNCIONA JUNIT ASIQUE LO HARE AUTOMATICO
import java.util.Date;

public class BibliotecaTest {

    public static void main(String[] args) {
        testDarDeAltaLibro();
        testDarDeBajaLibro();
        testDarDeAltaUsuario();
        testDarDeBajaUsuario();
    }

    public static void testDarDeAltaLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Título", "Autor", 1, "Aventuras", 10);

        biblioteca.darDeAltaLibro(libro);

        if (biblioteca.getLibros().contains(libro)) {
            System.out.println("El libro se dio de alta correctamente.");
        } else {
            System.out.println("ERROR: Fallo al dar de alta el libro.");
        }
    }

    public static void testDarDeBajaLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Título", "Autor", 1, "Aventuras", 10);
        biblioteca.darDeAltaLibro(libro);

        biblioteca.darDeBajaLibro(libro);

        if (!biblioteca.getLibros().contains(libro)) {
            System.out.println("El libro se dio de baja correctamente.");
        } else {
            System.out.println("ERROR: Fallo al dar de baja el libro.");
        }
    }

    public static void testDarDeAltaUsuario() {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario("Nombre", "Apellido1", "Apellido2", new Date(), "12345678A");

        biblioteca.darDeAltaUsuario(usuario);

        if (biblioteca.getUsuarios().contains(usuario)) {
            System.out.println("El usuario se dio de alta correctamente.");
        } else {
            System.out.println("ERROR: Fallo al dar de alta el usuario.");
        }
    }

    public static void testDarDeBajaUsuario() {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario("Nombre", "Apellido1", "Apellido2", new Date(), "12345678A");
        biblioteca.darDeAltaUsuario(usuario);

        biblioteca.darDeBajaUsuario(usuario);

        if (!biblioteca.getUsuarios().contains(usuario)) {
            System.out.println("El usuario se dio de baja correctamente.");
        } else {
            System.out.println("ERROR: Fallo al dar de baja el usuario.");
        }
    }
}



