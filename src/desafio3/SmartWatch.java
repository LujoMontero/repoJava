package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartWatch {
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

        //        2. Ejercicio 2 - SmartWatch

        ArrayList<Integer> pasos = new ArrayList<Integer>();
        pasos.add(300);
        pasos.add(155000);
        pasos.add(405);
        pasos.add(403);
        pasos.add(506);
        pasos.add(100020040);
        pasos.add(45006);
        pasos.add(-1044);

        clearSteps(pasos);
        System.out.println("Tu promedio de paso es: " + promedio(pasos));

    }
    
    public static void clearSteps(ArrayList<Integer> pasoC){
        
        for (int i = 0; i < pasoC.size(); i++) {
            if (pasoC.get(i) <= 200 || pasoC.get(i) >= 100000) {
                pasoC.remove(i);
            }
        }
        System.out.println("Array limpio = " + pasoC);
    }
    
    public static Integer promedio(ArrayList<Integer> pasosP) {
        int promedio = 0;
        int contador = 0;
        for (int i = 0; i < pasosP.size(); i++) {
            if (pasosP.get(i) >= 200 && pasosP.get(i) <= 100000) {
                promedio += pasosP.get(i);
                contador++;
            }
        }
        promedio/=contador;
        return promedio;
    }
}
