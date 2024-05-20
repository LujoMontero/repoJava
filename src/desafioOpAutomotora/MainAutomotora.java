package desafioOpAutomotora;
import DesafioManejoDeExcepciones.LibroVenta;
import java.io.*;


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

        Cliente cliente = new Cliente(23445678, "Luis Jose", 30);
        Vehiculo vehiculo = new Vehiculo("Rojo", "cvbghj");

        LibroVenta libroVenta = new LibroVenta("Venta1", "14092024");

        LibroVenta.crearDireArchi(directorio, fichero);

        System.out.println("cliente = " + cliente);
        System.out.println("vehiculo = " + vehiculo);
        System.out.println("libroVenta = " + libroVenta);

        libroVenta.guardarVenta(cliente,vehiculo,directorio,fichero);

    }


}
