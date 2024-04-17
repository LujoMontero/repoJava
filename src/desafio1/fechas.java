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
        System.out.println("ano = " + anno + "\n");
        System.out.println("dia2 = " + dia2);
        System.out.println("mes2 = " + mes2);
        System.out.println("ano2 = " + anno2 + "\n");

    //Comparando fechas

        if (anno < anno2 || (anno == anno2 && mes < mes2) || (anno == anno2 && mes == mes2 && dia < dia2)) {
            System.out.println("\u001B[4mLa persona 1 es mayor.\u001B[0m\n");
        } else if (anno2 < anno || (anno2 == anno && mes2 < mes) || (anno2 == anno && mes2 == mes && dia2 < dia)) {
            System.out.println("\u001B[4mLa persona 2 es mayor.\u001B[0m\n");
        } else {
            System.out.println("\u001B[4mTienen la misma edad.\u001B[0m\n");
        }

        System.out.println("fecha de la persona 1 = " + fecha);
        System.out.println("fecha de la persona 2 = " + fecha2);

    }
}