package desafíoGuiadoMirandoElPasado;

import java.util.Map;
import java.util.TreeMap;

public class MainMPiii {
    public static void main(String[] args) {

        Map<String, Integer> golosinas = new TreeMap<>();

        // Agregar las golosinas con sus respectivos precios al Map
        golosinas.put("toronto", 50);
        golosinas.put("marilu", 100);
        golosinas.put("cocosette", 100);
        golosinas.put("bolibomba", 50);
        golosinas.put("bubaloo", 30);
        golosinas.put("pitulin", 150);
        golosinas.put("nutela", 300);

        System.out.println("Listado completo de golosinas:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " pesos");
        }

        // Filtrar y mostrar las golosinas que costaban menos de 100 pesos
        System.out.println("\nGolosinas que costaban menos de 100 pesos:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " pesos");
            }
        }
    }
}
