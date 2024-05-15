package desafio4;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

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

        String directorio = "src/miDirectory";
        String fichero = "fichero.txt";

        crearArchivo(directorio, fichero);

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


            FileWriter fw = new FileWriter("src/miDirectory/fichero.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Iterator<String> iterator = lista.iterator();
            while (iterator.hasNext()) {
                String linea = iterator.next();
                bw.write(linea);
                bw.newLine();
            }
            bw.close();
            System.out.println("Contenido agregado al archivo correctamente.");

        buscarTexto("fichero.txt", "perro");

    }

    public static void crearArchivo(String directorio, String fichero) throws IOException {
        crearDirectorio(directorio);

        File archivo = new File(directorio + "/" + fichero);

        if (!archivo.exists()) {
            archivo.createNewFile();
            System.out.println("El fichero se ha creado correctamente.");
        } else if(archivo.exists()){
            System.out.println("El fichero ya existe.");
        }else {
            System.out.println("Error al crear directorio");
        }
    }

    public static void crearDirectorio(String nombre) {
        File directorio = new File(nombre);

        if (!directorio.exists()) {
            directorio.mkdirs();
            System.out.println("El directorio se ha creado correctamente.");
        } else {
            System.out.println("El directorio ya está creado.");
        }
    }
    public static void buscarTexto(String nombreFichero, String texto) throws IOException {

        File archivo = new File(nombreFichero);

        if (!archivo.exists()) {
            System.out.println("El fichero ingresado no existe");
            return;
        }
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(texto)) {
                    contador++;
                }
            }
            br.close();
            System.out.println("si se encuentra:" + texto );
        System.out.println("cantidad de repeticiones del texto -> " + contador);

    }

}