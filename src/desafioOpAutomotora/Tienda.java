package desafioOpAutomotora;

public class Tienda {
    private Vendedor vendedor;
    private Cliente cliente;
    private System stock;

    public Tienda() {
    }

    public Tienda(Vendedor vendedor, Cliente cliente, System stock) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public System getStock() {
        return stock;
    }

    public void setStock(System stock) {
        this.stock = stock;
    }

    public void existeStock(){
        System.out.println("no sabemos");
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", stock=" + stock +
                '}';
    }
}
