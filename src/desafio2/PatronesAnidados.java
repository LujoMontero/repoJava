package desafio2;

import java.util.Scanner;

public class PatronesAnidados {
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

        System.out.printf(ANSI_YELLOW + "Ingresa un numero: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1) || (j == 0 || j == n - 1)) {
                    System.out.print(ANSI_RED + "*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

