package desafíoReciclaJeans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoServicioRJ {
    public ArrayList<ProductoRJ> cargarDatos(String filePath) {
        ArrayList<ProductoRJ> listaProductoRJS = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    ProductoRJ productoRJ = new ProductoRJ(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
                    listaProductoRJS.add(productoRJ);
                }
            }
            System.out.println("Datos cargados correctamente en la lista.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al cargar los datos: " + e.getMessage());
        }
        return listaProductoRJS;
    }
}
