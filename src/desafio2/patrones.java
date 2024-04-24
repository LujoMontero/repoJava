package desafio2;

import java.util.Scanner;

public class patrones {
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


        //Ejercicio 1 - Patrones

        //Patron 1

//        System.out.println("Ingresa un numero: ");
//        int numero = sc.nextInt();
//        for (int i = 0; i < numero; i++) {
//
//            if (i % 2 == 0) {
//                System.out.print(ANSI_GREEN+"*");
//            }else{
//                System.out.print(ANSI_RED+".");
//            }
//        }

        //Patron 2

//        System.out.println(ANSI_YELLOW +"Hasta que numero quiere que se repita: ");
//        int n = sc.nextInt();
//        System.out.println(ANSI_YELLOW + "cuanta veces quiere que se repita la secuencia: ");
//        int rep=sc.nextInt();
//            int color = rep/2;
//        for (int i = 0; i < rep; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i <=color ) {
//                    System.out.printf(ANSI_BLUE+"%d",j);
//                }else {
//                    System.out.printf(ANSI_RED + "%d", j);
//                }
//            }
//        }

        //Patron 3

        System.out.println(ANSI_YELLOW + "ingresa un numero: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(ANSI_BLUE + "||");
            } else {
                System.out.print(ANSI_RED + "*");
            }
        }
    }
}
