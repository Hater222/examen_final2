package Ejercicio02ex;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void darDeAltaLibro(Libro libro) {
        libros.add(libro);
    }

    public void darDeBajaLibro(Libro libro) {
        libros.remove(libro);
    }

    public void darDeAltaUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void darDeBajaUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    // Otros métodos de la biblioteca

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}

