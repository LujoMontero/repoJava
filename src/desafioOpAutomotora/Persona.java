package desafioOpAutomotora;

public class Persona {
    private int rut;
    private String nombre;

    public Persona() {
    }

    public Persona(int rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rut=" + rut +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
