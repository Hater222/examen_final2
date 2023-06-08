package Ejercicio02ex;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro("Título 1", "Autor 1", 1, "Aventuras", 10);
        Libro libro2 = new Libro("Título 2", "Autor 2", 2, "Ciencia Ficción", 12);
        Libro libro3 = new Libro("Título 3", "Autor 3", 3, "Romántica", 15);

        // Dar de alta los libros en la biblioteca
        biblioteca.darDeAltaLibro(libro1);
        biblioteca.darDeAltaLibro(libro2);
        biblioteca.darDeAltaLibro(libro3);

        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Juan", "Pérez", "Gómez", new Date(), "12345678A");
        Usuario usuario2 = new Usuario("María", "López", "Martínez", new Date(), "87654321B");

        // Dar de alta los usuarios en la biblioteca
        biblioteca.darDeAltaUsuario(usuario1);
        biblioteca.darDeAltaUsuario(usuario2);

        // Acceder a la lista de libros y usuarios de la biblioteca
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.getTitulo());
        }

        System.out.println("Usuarios en la biblioteca:");
        for (Usuario usuario : biblioteca.getUsuarios()) {
            System.out.println(usuario.getNombre());
        }
    }
}

