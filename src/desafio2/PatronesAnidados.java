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

                    int n1 = interacionIngresoN();
                    patron1(n1);
                    break;

                case "2":
                    // Patrón 2

                    int n2 = interacionIngresoN();
                    patron2(n2);
                    break;

                case "3":
                    // Patrón 3

                    int n3 = interacionIngresoN();
                    patron3(n3);
                    break;

//                case "4":
//                    // Patrón 4
//
//                    int n4 = interacionIngresoN();
//                    patron3(n4);
//                    break;

                case "0":
                    salida();
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
        System.out.println(ANSI_BLUE + "4. Patrón 4");
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

    static public int interacionIngresoN() {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.printf(ANSI_YELLOW + "Ingresa un numero: ");
        numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }
    static public void patron1(int num){

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i == 0 || i == num - 1) || (j == 0 || j == num - 1)) {
                    System.out.print(ANSI_RED + "*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static public void patron2(int num){

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || i + j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static public void patron3(int num){

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static public void salida(){
        System.out.println("Saliendo del programa...doble enter para finalizar");
    }
}