package desafíoReciclaJeans;

import DesafioTiendaIndianaJeans.ExportadorTxt;
import DesafioTiendaIndianaJeans.Producto;
import DesafioTiendaIndianaJeans.ProductoServicio;

import java.util.Scanner;

import static DesafioTiendaIndianaJeans.Utilidad.limpiarPantalla;

public class Menu {

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
        Scanner sc = new Scanner(System.in);

        DesafioTiendaIndianaJeans.ProductoServicio productoServicio = new ProductoServicio();
        ExportadorTxt exportadorTxt = new ExportadorTxt();

        boolean salir = false;
        while (!salir) {
            System.out.println("1 --> Listar Producto");
            System.out.println("2 --> Agregar Producto");
            System.out.println("3 --> Exportar Datos");
            System.out.println("4 --> Salir");
            System.out.print("Ingrese una opción: ");

            String input = sc.nextLine();
            int opcion = 0;

            try {
                opcion = Integer.parseInt(input);
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opcion no valida!");
                    System.out.println("****************************************************************\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida, debe ingresar un número del 1 al 4. Intente nuevamente.");
                System.out.println("******************************************************************\n");
            }

            switch (opcion) {
                case 1:
                    productoServicio.listarProductos();
                    break;
                case 2:
                    System.out.print("Ingresar nombre articulo: ");
                    String articulo = sc.nextLine();
                    System.out.print("Ingresar precio: ");
                    String precio = sc.nextLine();
                    System.out.print("Ingresar descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingresar código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Ingresar talla: ");
                    String talla = sc.nextLine();
                    System.out.print("Ingresar marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingresar color: ");
                    String color = sc.nextLine();

                    DesafioTiendaIndianaJeans.Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
                    productoServicio.agregarProducto(producto);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del archivo para exportar los datos (con extensión .txt): ");
                    String filePath = sc.nextLine();
                    exportadorTxt.exportar(productoServicio.getListaProductos(), filePath);
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }
}
