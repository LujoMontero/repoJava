package DesafioManejoDeExcepciones;

import desafioOpAutomotora.Cliente;
import desafioOpAutomotora.Vehiculo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta() {
    }

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "LibroVenta{" +
                "nombreVenta='" + nombreVenta + '\'' +
                ", fechaVenta='" + fechaVenta + '\'' +
                '}';
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo, String directorio, String fichero) throws IOException {

        int fecha2 = Integer.parseInt(fechaVenta);
        File archivo = new File(directorio, fichero);

        try (BufferedWriter texto = new BufferedWriter(new FileWriter(archivo))) {
            texto.write("Patente del vehículo: " + vehiculo.getPatente() + "\n");
            texto.write("Edad del cliente: " + cliente.getEdad() + "\n");
            texto.write("Fecha de la venta (DDMMYYYY): " + fecha2 + "\n");
            texto.write("Nombre de la venta: " + nombreVenta + "\n");
            System.out.println("El archivo se ha creado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
            throw e;
        }
    }

    public static void crearDireArchi(String directorio1, String fichero) throws IOException {

        File directorio = new File(directorio1);

        if (!directorio.exists()) {
            try {
                if (directorio.mkdirs()) {
                    System.out.println("El directorio se ha creado correctamente.");
                } else {
                    System.out.println("Error al crear el directorio.");
                    return;
                }
            } catch (SecurityException e) {
                System.out.println("No se pudo crear el directorio debido a permisos insuficientes: " + e.getMessage());
                return;
            }
        } else {
            System.out.println("El directorio ya está creado.");
        }

        File archivo = new File(directorio, fichero);

        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("El archivo se ha creado correctamente.");
                } else {
                    System.out.println("Error al crear el archivo.");
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
            } catch (SecurityException e) {
                System.out.println("No se pudo crear el archivo debido a permisos insuficientes: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe.");
        }
    }

}
