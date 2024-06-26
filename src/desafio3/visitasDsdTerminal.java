package desafio3;

public class visitasDsdTerminal {
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
            int[] visitasDiarias = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            }

            int promedio = promedio(visitasDiarias);
            System.out.println(ANSI_YELLOW + "El promedio de visitas diarias es: " + promedio + ANSI_BLUE);
        }

        public static int promedio(int[] visitasDiarias) {
            int suma = 0;

            for (int visitas : visitasDiarias) {
                suma += visitas;
            }

            return suma / visitasDiarias.length;
        }

}

