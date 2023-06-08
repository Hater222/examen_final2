


package Ejercicio02ex;

public class LibroTest {

    public static void main(String[] args) {
        testGettersSetters();
    }

    public static void testGettersSetters() {
        Libro libro = new Libro("Título", "Autor", 1, "Aventuras", 10);

        if (libro.getTitulo().equals("Título") &&
                libro.getAutor().equals("Autor") &&
                libro.getIdentificador() == 1 &&
                libro.getCategoria().equals("Aventuras") &&
                libro.getEdadRecomendada() == 10) {
            System.out.println("Los getters devuelven los valores correctos.");

            libro.setTitulo("Nuevo Título");
            libro.setAutor("Nuevo Autor");
            libro.setIdentificador(2);
            libro.setCategoria("Ciencia Ficción");
            libro.setEdadRecomendada(12);

            if (libro.getTitulo().equals("Nuevo Título") &&
                    libro.getAutor().equals("Nuevo Autor") &&
                    libro.getIdentificador() == 2 &&
                    libro.getCategoria().equals("Ciencia Ficción") &&
                    libro.getEdadRecomendada() == 12) {
                System.out.println("Los setters asignan los valores correctamente.");
            } else {
                System.out.println("ERROR: Los setters no asignan los valores correctamente.");
            }
        } else {
            System.out.println("ERROR: Los getters no devuelven los valores correctos.");
        }
    }
}


