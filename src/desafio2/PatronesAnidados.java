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

        // Ejercicio 2 - Patrones anidados

        String opcion;
        do {
            menu();
            opcion = interacionValidacion();

            switch (opcion) {
                case "1":
                    // Patrón 1
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
                    break;

                case "2":
                    // Patrón 2

                    break;

                case "3":
                    // Patrón 3

                    break;

                case "0":
                    System.out.println("Saliendo del programa...doble enter para finalizar");
                    break;
            }
            sc.nextLine(); // Limpia el buffer del scanner

        } while (!opcion.equals("0"));
    }

    static public void menu() {
        System.out.println(ANSI_YELLOW + "Selecciona el patrón que deseas mostrar:");
        System.out.println(ANSI_YELLOW + "1. Patrón 1");
        System.out.println(ANSI_BLUE + "2. Patrón 2");
        System.out.println(ANSI_BLUE + "3. Patrón 3");
        System.out.println(ANSI_RED + "0. Salir");
        System.out.println(ANSI_RED + "Ingrese su opción: ");
    }

    static public String interacionValidacion() {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        opcion = sc.nextLine();

        while (!(opcion.equals("1") || opcion.equals("2")) && (!(opcion.equals("3") || opcion.equals("4"))) && (!opcion.equals("0"))) {
            System.out.println("no es una opcion");
            System.out.println("vuelva ingresar una opcion valida");
            opcion = sc.nextLine();
        }
        return opcion;
    }
}