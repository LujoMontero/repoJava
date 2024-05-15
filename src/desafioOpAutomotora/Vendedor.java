package desafioOpAutomotora;

public class Vendedor extends Persona {
    private String direccion;

    public Vendedor() {
    }

    public Vendedor(String direccion) {
        this.direccion = direccion;
    }

    public Vendedor(int rut, String nombre, String direccion) {
        super(rut, nombre);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "direccion='" + direccion + '\'' +
                "} " + super.toString();
    }
}
