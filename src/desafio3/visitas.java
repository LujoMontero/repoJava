package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class visitas {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Ejercicio 1 - Visitas

        ArrayList<Integer> visita = new ArrayList<Integer>();
        visita.add(3001);
        visita.add(1402);
        visita.add(1304);
        visita.add(1505);

        System.out.println(ANSI_YELLOW + "visita del dia de hoy: ");
        visita.add(sc.nextInt());

        System.out.println(ANSI_BLUE + "Para la entrada anterior, el resultado es: " + promedio(visita));
        System.out.println(ANSI_RED + "visita por dias = " + visita);


    }
    public static Integer promedio(ArrayList<Integer> visita) {
        int promedio = 0;
        int contador = 0;
        for (int i = 0; i < visita.size(); i++) {
            if (visita.get(i) >= 200 && visita.get(i) <= 100000) {
                promedio += visita.get(i);
                contador++;
            }
        }
        promedio/=contador;

        return promedio;
    }
}
