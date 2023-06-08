

package Ejercicio02ex;
import java.util.Date;

public class UsuarioTest {

    public static void main(String[] args) {
        testGettersSetters();
    }

    public static void testGettersSetters() {
        Usuario usuario = new Usuario("Nombre", "Apellido1", "Apellido2", new Date(), "12345678A");

        if (usuario.getNombre().equals("Nombre") &&
                usuario.getApellido1().equals("Apellido1") &&
                usuario.getApellido2().equals("Apellido2") &&
                usuario.getFechaNacimiento().equals(new Date()) &&
                usuario.getDni().equals("12345678A")) {
            System.out.println("Los getters devuelven los valores correctos.");

            usuario.setNombre("Nuevo Nombre");
            usuario.setApellido1("Nuevo Apellido1");
            usuario.setApellido2("Nuevo Apellido2");
            usuario.setFechaNacimiento(new Date());
            usuario.setDni("87654321B");

            if (usuario.getNombre().equals("Nuevo Nombre") &&
                    usuario.getApellido1().equals("Nuevo Apellido1") &&
                    usuario.getApellido2().equals("Nuevo Apellido2") &&
                    usuario.getFechaNacimiento().equals(new Date()) &&
                    usuario.getDni().equals("87654321B")) {
                System.out.println("Los setters asignan los valores correctamente.");
            } else {
                System.out.println("ERROR: Los setters no asignan los valores correctamente.");
            }
        } else {
            System.out.println("ERROR: Los getters no devuelven los valores correctos.");
        }
    }
}

