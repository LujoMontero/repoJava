package desafíoGuiadoMirandoElPasado;

import java.util.LinkedList;
import java.util.Queue;

public class MainMPiiii {
    public static void main(String[] args) {

        Queue<String> juegos = new LinkedList<>();

        // Agregar los juegos al Queue
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        // Contar la cantidad de juegos e imprimir en pantalla
        int cantidadJuegos = juegos.size();
        System.out.println("Cantidad de juegos en la lista: " + cantidadJuegos);

        // Imprimir los juegos para visualizarlos
        System.out.println("\nListado de juegos:");
        for (String juego : juegos) {
            System.out.println(juego);
        }
    }
}
