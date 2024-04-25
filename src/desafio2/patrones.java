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

        String opcion;
        do {
            System.out.println(ANSI_YELLOW + "Selecciona el patrón que deseas mostrar:");
            System.out.println(ANSI_YELLOW + "1. Patrón 1");
            System.out.println(ANSI_BLUE + "2. Patrón 2");
            System.out.println(ANSI_BLUE + "3. Patrón 3");
            System.out.println(ANSI_RED + "0. Salir");
            System.out.println(ANSI_RED + "Ingrese su opción: ");

            opcion = sc.nextLine();

                while (!(opcion.equals("1") || opcion.equals("2")) && (!(opcion.equals("3") || opcion.equals("4"))) && (!opcion.equals("0"))) {
                    System.out.println("no es una opcion");
                    System.out.println("vuelva ingresar una opcion valida");
                    opcion = sc.nextLine();
                }

                switch (opcion) {
                    case "1":
                        // Patrón 1
                        System.out.println(ANSI_YELLOW + "Ingresa un numero para el Patrón 1: ");
                        int numero1 = sc.nextInt();
                        for (int i = 0; i < numero1; i++) {
                            if (i % 2 == 0) {
                                System.out.print(ANSI_GREEN + "*");
                            } else {
                                System.out.print(ANSI_RED + ".");
                            }
                        }
                        System.out.println(ANSI_RESET);
                        System.out.println();
                        break;

                    case "2":
                        // Patrón 2
                        System.out.println(ANSI_YELLOW + "Hasta qué número quiere que se repita el Patrón 2: ");
                        int n2 = sc.nextInt();
                        System.out.println(ANSI_YELLOW + "¿Cuántas veces quiere que se repita la secuencia?: ");
                        int rep2 = sc.nextInt();
                        int color2 = rep2 / 2;
                        for (int i = 0; i < rep2; i++) {
                            for (int j = 1; j <= n2; j++) {
                                if (i < color2) {
                                    System.out.printf(ANSI_BLUE + "%d", j);
                                } else {
                                    System.out.printf(ANSI_RED + "%d", j);
                                }

                            }
                        }
                        System.out.println(ANSI_RESET);
                        break;

                    case "3":
                        // Patrón 3
                        System.out.println(ANSI_YELLOW + "Ingrese un numero para el Patrón 3: ");
                        int numero3 = sc.nextInt();
                        for (int i = 0; i <= numero3; i++) {
                            if (i % 2 == 0) {
                                System.out.print(ANSI_BLUE + "||");
                            } else {
                                System.out.print(ANSI_RED + "*");
                            }
                        }
                        System.out.println(ANSI_RESET); // Restablecer color después del patrón
                        break;

                    case "0":
                        System.out.println("Saliendo del programa...doble enter para finalizar");
                        break;
                }
            sc.nextLine(); // Limpia el buffer del scanner

        } while (!opcion.equals("0"));
    }
}
