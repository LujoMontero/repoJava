package desafio3;

import java.util.ArrayList;

public class SmartWatchDsdTerminal {
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
        ArrayList<Integer> pasos = new ArrayList<>();

        for (String arg : args) {
            try {
                int paso = Integer.parseInt(arg);
                pasos.add(paso);
            } catch (NumberFormatException e) {
                // Ignora los argumentos que no son números
            }
        }

        clearSteps(pasos);
        System.out.println(ANSI_BLUE + "Tu promedio de pasos es: " + promedio(pasos) + ANSI_RED);
    }

    public static void clearSteps(ArrayList<Integer> pasos) {

        for (int i = pasos.size() - 1; i >= 0; i--) {
            int paso = pasos.get(i);
            if (paso <= 200 || paso >= 100000) {
                pasos.remove(i);
            }
        }
        System.out.println(ANSI_YELLOW + "Pasos filtrados: " + pasos);
    }

    public static double promedio(ArrayList<Integer> pasos) {
        if (pasos.isEmpty()) return 0.0;

        int sum = 0;
        for (int paso : pasos) {
            sum += paso;
        }
        return (double) sum / pasos.size();
    }
}
