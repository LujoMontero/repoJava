package desafio3;

public class MultTresPromedioDsdTerminal {
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
        int[] numeros = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        int suma = 0;
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                suma += numeros[i];
                contador++;
            }
        }

        System.out.println(ANSI_YELLOW + suma);
        System.out.println(ANSI_BLUE + promedio(suma, contador) + ANSI_RED);
    }

    public static double promedio(int suma, int contador) {
        if (contador == 0) {
            return 0;
        } else {
            return (double) suma / contador;
        }
    }
}