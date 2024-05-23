package DesafioTiendaIndianaJeans;

import java.util.ArrayList;

public class ProductoServicio {
    ArrayList<Producto> listaProductos;

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

    @Override
    public String toString() {
        return "ProductoServicio{" +
                "listaProductos=" + listaProductos +
                '}';
    }
    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }
}