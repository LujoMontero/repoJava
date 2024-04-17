package desafio1;

import java.util.Scanner;

public class fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        String fecha = sc.nextLine();

        System.out.println("Ingrese la segunda fecha como MM/AAAA");
        String fecha2 = sc.nextLine();

        System.out.println("fecha = " + fecha);
        System.out.println("fecha2 = " + fecha2);

    }
}