package desafíoReciclaJeans;

import DesafioTiendaIndianaJeans.Producto;

import java.util.ArrayList;

public class ProductoServicioRJ {
   private ArrayList<ProductoRJ> listaProductos;

    public ProductoServicioRJ() {
    }

    public ProductoServicioRJ(ArrayList<ProductoRJ> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<ProductoRJ> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ProductoRJ> listaProductos) {
        this.listaProductos = listaProductos;
    }


    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (ProductoRJ producto : listaProductos) {
                System.out.println(producto);
            }
        }
    }

    public void agregarProducto(ProductoRJ producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    public void editarProducto(String codigo, int opcion, String nuevoValor) {
        for (ProductoRJ producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                switch (opcion) {
                    case 1:
                        producto.setArticulo(nuevoValor);
                        break;
                    case 2:
                        producto.setCodigo(nuevoValor);
                        break;
                    case 3:
                        producto.setColor(nuevoValor);
                        break;
                    case 4:
                        producto.setDescripcion(nuevoValor);
                        break;
                    case 5:
                        producto.setMarca(nuevoValor);
                        break;
                    case 6:
                        producto.setPrecio(nuevoValor);
                        break;
                    case 7:
                        producto.setTalla(nuevoValor);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                System.out.println("Producto editado exitosamente.");
                return;
            }
        }
        System.out.println("Producto con código " + codigo + " no encontrado.");
    }
}
