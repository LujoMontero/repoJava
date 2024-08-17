package desafíoGuiadoMirandoElPasado;

import java.util.Set;
import java.util.TreeSet;

public class MainMPii {
    public static void main(String[] args) {

        Set<String> invitados = new TreeSet<>();

        // Agregar nombres de ex compañeros al Set
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        System.out.println("Listado inicial de invitados:");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }

        // Crear un Set de "posibles invitados" y unirlo con el Set de "invitados"
        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);

        System.out.println("\nListado después de agregar posibles invitados:");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }

        // Eliminar a "Jorge" del Set de invitados
        invitados.remove("Jorge");

        System.out.println("\nListado final de invitados después de eliminar a 'Jorge':");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }
    }
}
