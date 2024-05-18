package desafioOpAutomotora;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MainAutomotora {
    public static void main(String[] args) throws IOException {

        Taxi taxi = new Taxi(2500);
        taxi.pagarPasaje(1000);

        Bus bus = new Bus(10);
        bus.asientosDisponibles(6);
        bus.asientosDisponibles(13);

        MiniBus miniBus = new MiniBus("Azul", "XYZ123", 30, "Turismo");
        miniBus.imprimeBus();

        Tienda tienda = new Tienda();
        tienda.setStock(33);
        tienda.existeStock();

//--------------------- desafio de manejo de Excepciones --------------------------------------

        String directorio = "src/fichero";
        String fichero = "nombre_venta.txt";

        crearArchivo(directorio, fichero);

    }

    public static void crearArchivo(String directorio, String fichero) throws IOException {

        crearDirectorio(directorio);

        File archivo = new File(directorio + "/" + fichero);

        if (!archivo.exists()) {
            archivo.createNewFile();
            System.out.println("El archivo se ha creado correctamente.");
        } else if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            System.out.println("Error al archivo package");
        }
    }

    public static void crearDirectorio(String nombre) {
        File directorio = new File(nombre);

        if (!directorio.exists()) {
            directorio.mkdirs();
            System.out.println("El package se ha creado correctamente.");
        } else {
            System.out.println("El package ya está creado.");
        }
    }

}
