package desafíoReciclaJeans;

import DesafioTiendaIndianaJeans.Producto;

import java.util.ArrayList;

public class ProductoServicio {
   private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (Producto producto : listaProductos) {
                System.out.println(producto);
            }
        }
    }
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado exitosamente.");
    }
}
