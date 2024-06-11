package DesafioTiendaIndianaJeans;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends Exportador{

    @Override
    public void exportar(ArrayList<Producto> listaProductos, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Producto producto : listaProductos) {
                writer.write(producto.toString());
                writer.newLine();
            }
            System.out.println("Datos exportados exitosamente a " + filePath);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al exportar los datos: " + e.getMessage());
        }
    }
}
