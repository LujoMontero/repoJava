package desafíoReciclaJeans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoServicioRJ {

    public ArrayList<ProductoRJ> cargarDatos(String filePath) {
        ArrayList<ProductoRJ> listaProductos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    ProductoRJ producto = new ProductoRJ(
                            data[0].trim(),   // artículo
                            data[1].trim(),   // código
                            data[2].trim(),   // descripción
                            data[3].trim(),   // precio
                            data[4].trim(),   // talla
                            data[5].trim(),   // marca
                            data[6].trim());  // color
                    listaProductos.add(producto);
                }
            }
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (IOException e) {
            System.out.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }

        return listaProductos;
    }
}