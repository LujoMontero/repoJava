package desafio4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Escrituraylectura {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws IOException {

        String directorio = "directory";
        String archivo = "texto.txt";

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");
    }
    public static void createDirectory(String dir) throws IOException {
        //crea el directorio
        File directory = new File("src/"+dir);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("File created successfully");

        }else{
            System.out.println("Directory already exists");
        }
    }
    public static void createArchivos(String archivo) throws IOException {
        File file = new File("src/" + archivo);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("Archivo created successfully");
        } else {
            System.out.println("Archivo already exists");
        }
    }
}