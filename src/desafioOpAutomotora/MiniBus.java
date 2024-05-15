package desafioOpAutomotora;

public class MiniBus extends Bus {
    private String tipoViaje;

    public MiniBus() {
    }

    public MiniBus(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public MiniBus(String color, String patente, int cantidadDeAsiento, String tipoViaje) {
        super(color, patente, cantidadDeAsiento);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    @Override
    public String toString() {
        return "MiniBus{" +
                "tipoViaje='" + tipoViaje + '\'' +
                "} " + super.toString();
    }
}
