package desafio1;

import java.util.Scanner;

public class fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Agregamos fechas al programa
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
        String fecha = sc.nextLine();

        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
        String fecha2 = sc.nextLine();

    // Convertimos el string a int tomando dia mes y año por separado
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int anno = Integer.parseInt(fecha.substring(6,10));

        int dia2 = Integer.parseInt(fecha2.substring(0,2));
        int mes2 = Integer.parseInt(fecha2.substring(3,5));
        int anno2 = Integer.parseInt(fecha2.substring(6,10));

        System.out.println("dia = " + dia);
        System.out.println("mes = " + mes);
        System.out.println("ano = " + anno);
        System.out.println("dia2 = " + dia2);
        System.out.println("mes2 = " + mes2);
        System.out.println("ano2 = " + anno2);

    //Comparando fechas

        if (anno < anno2) {
            System.out.println("La persona 1 es mayor.");
        } else if (anno2 < anno) {
            System.out.println("La persona 2 es mayor.");
        } else {
            System.out.println("Tienen la misma edad.");
        }


        System.out.println("fecha de la persona 1 = " + fecha);
        System.out.println("fecha de la persona 2 = " + fecha2);

    }
}