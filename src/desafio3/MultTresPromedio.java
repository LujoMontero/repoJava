package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class MultTresPromedio {
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

//       4. Ejercicio 4 - Promedios
        ArrayList<Double> tres = new ArrayList<Double>();
        tres.add(1D);
        tres.add(20D);
        tres.add(30D);
        tres.add(33D);
        tres.add(21D);
        tres.add(8D);
        tres.add(2D);
        tres.add(61D);

        System.out.println(ANSI_YELLOW + "La suma de los múltiplos de tres es: " + sumaTres(tres));
        System.out.println(ANSI_BLUE + "El promedio de los multiplo de tres es: " + promedioTres(tres));

    }
    public static Double sumaTres (ArrayList<Double> sumat) {
        double suma = 0;
        for (int i = 0; i < sumat.size(); i++) {
            if (sumat.get(i) % 3 == 0) {
                suma += sumat.get(i);
            }
        }
        return suma;
    }
    public static Double promedioTres (ArrayList<Double> promedioT) {
        double promedio = 0;
        int contador = 0;
        for (int i = 0; i < promedioT.size(); i++) {
            if (promedioT.get(i) % 3 == 0) {
                promedio += promedioT.get(i);
                contador++;
            }
        }
        promedio/=contador;
        return promedio;
    }
}