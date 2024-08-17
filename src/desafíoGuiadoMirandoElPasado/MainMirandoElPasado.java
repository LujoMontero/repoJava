package desafíoGuiadoMirandoElPasado;

import java.util.ArrayList;

public class MainMirandoElPasado {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();

        // Agregar 10 marcas conocidas e imprimirlas en consola
        marcas.add("Cocacola");
        marcas.add("Nokia");
        marcas.add("Maltin polar");
        marcas.add("Atari");
        marcas.add("Harina pan");
        marcas.add("MySpace");
        marcas.add("Yahoo");
        marcas.add("Toronto");
        marcas.add("Bubaloo");
        marcas.add("Pirulin");

        System.out.println("Listado inicial de marcas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Agregar "Blokbaster", "Carrefour" y "Jetix" al listado e imprimirlo
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.println("\nListado después de agregar nuevas marcas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Cambiar "Blokbaster" por "Blockbuster"
        int index = marcas.indexOf("Blokbaster");
        if (index != -1) {
            marcas.set(index, "Blockbuster");
        }

        System.out.println("\nListado después de corregir 'Blokbaster' a 'Blockbuster':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Remover "Carrefour" del listado e imprimir el resultado
        boolean removed = marcas.remove("Carrefour");

        System.out.println("\nListado después de remover 'Carrefour': (removido: " + removed + ")");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Crear una nueva lista "posiblesMarcas" e incorporarla a "marcas"
        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Circuit City");
        posiblesMarcas.add("Borders");
        posiblesMarcas.add("RadioShack");

        marcas.addAll(posiblesMarcas);

        System.out.println("\nListado después de agregar 'posiblesMarcas':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Contar la cantidad de elementos en la lista e imprimirlo
        int totalMarcas = marcas.size();
        System.out.println("\nTotal de marcas en la lista: " + totalMarcas);
    }
}
