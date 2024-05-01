package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplosDeTres {
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

//        3. Ejercicio 3 - Múltiplos de tres
        ArrayList<Integer> tres = new ArrayList<Integer>();
        tres.add(1);
        tres.add(20);
        tres.add(30);
        tres.add(33);
        tres.add(21);
        tres.add(8);
        tres.add(2);
        tres.add(61);

        System.out.println(ANSI_YELLOW + "Agregar un numero mas: ");
        tres.add(sc.nextInt());
        System.out.println(ANSI_BLUE + "La suma de los múltiplos de tres es: " + sumaTres(tres));

    }
    public static Integer sumaTres (ArrayList<Integer> sumat) {
        int suma = 0;
        for (int i = 0; i < sumat.size(); i++) {
            if (sumat.get(i) % 3 == 0) {
                suma += sumat.get(i);
            }
        }
        return suma;
    }
}