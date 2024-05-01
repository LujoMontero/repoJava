package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplosDeTres {
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

//        Para la entrada anterior deberá mostrar en pantalla: 84.

        System.out.println("La suma de los múltiplos de tres es: " + sumaTres(tres));

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