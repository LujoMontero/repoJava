package desafíoReciclaJeans;

import java.util.ArrayList;
import java.util.Scanner;

import static DesafioTiendaIndianaJeans.Utilidad.limpiarPantalla;

public class MenuRJ {

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

        ArrayList<ProductoRJ> listaProductos = new ArrayList<>();

        ProductoServicioRJ productoServicio = new ProductoServicioRJ(listaProductos);

        productoServicio.agregarProducto(new ProductoRJ(
                "Jean",
                "1500",
                "Es un Jean muy lindo con hermosos detalles",
                "15000",
                "42",
                "Levis",
                "Azul Marino"));

        productoServicio.agregarProducto(new ProductoRJ(
                "Jean",
                "1501",
                "Es un Jean caro pero hermoso hermoso",
                "25000",
                "46",
                "IndianaJeans",
                "Blanco"));

        ArchivoServicioRJ archivoServicio = new ArchivoServicioRJ();

        boolean salir = false;

        while (!salir) {
            System.out.println("1 --> Listar Producto");
            System.out.println("2 --> Editar Datos");
            System.out.println("3 --> Importar Datos");
            System.out.println("4 --> Limpiar Pantalla");
            System.out.println("5 --> Salir");
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
                    System.out.print("Ingrese el código del producto a editar: ");
                    String codigo = sc.nextLine();
                    ProductoRJ producto = productoServicio.getListaProductos().stream()
                            .filter(p -> p.getCodigo().equals(codigo))
                            .findFirst()
                            .orElse(null);
                    if (producto != null) {
                        System.out.println("1.-El nombre del articulo actual es: " + producto.getArticulo());
                        System.out.println("2.-El código del producto: " + producto.getCodigo());
                        System.out.println("3.-El color del producto: " + producto.getColor());
                        System.out.println("4.-La descripción del producto: " + producto.getDescripcion());
                        System.out.println("5.-La marca del producto: " + producto.getMarca());
                        System.out.println("6.-El precio del producto: " + producto.getPrecio());
                        System.out.println("7.-La talla del producto: " + producto.getTalla());
                        System.out.print("Ingrese la opción a editar de los datos del producto: ");
                        int opcionEditar = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingrese el nuevo valor: ");
                        String nuevoValor = sc.nextLine();
                        productoServicio.editarProducto(codigo, opcionEditar, nuevoValor);
                    } else {
                        System.out.println("Producto con código " + codigo + " no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la ruta del archivo para importar los datos (con extensión .csv): ");
                    String filePath = sc.nextLine();
                    ArrayList<ProductoRJ> productosImportados = archivoServicio.cargarDatos(filePath);
                    productoServicio.setListaProductos(productosImportados);
                    break;

                case 4:
                    limpiarPantalla();
                    break;
                case 5:
                    System.out.print("Abandonando el sistema de clientes...\n" + "Acaba de salir del sistema");
                    salir = true;
                    break;
            }
        }
    }
}