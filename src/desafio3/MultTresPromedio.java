package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class MultTresPromedio {
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

//        28

        System.out.println("La suma de los múltiplos de tres es: " + sumaTres(tres));
        System.out.println("El promedio de los multiplo de tres es: " + promedioTres(tres));

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