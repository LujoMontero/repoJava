package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //        2. Ejercicio 2 - SmartWatch

        ArrayList<Integer> pasos = new ArrayList<Integer>();
        pasos.add(300);
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
