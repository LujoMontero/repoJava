package desafioOpAutomotora;

public class Bus extends Vehiculo {
    private int cantidadDeAsiento;

    public Bus() {
    }

    public Bus(int cantidadDeAsiento) {
        this.cantidadDeAsiento = cantidadDeAsiento;
    }

    public Bus(String color, String patente, int cantidadDeAsiento) {
        super(color, patente);
        this.cantidadDeAsiento = cantidadDeAsiento;
    }

    public int getCantidadDeAsiento() {
        return cantidadDeAsiento;
    }

    public void setCantidadDeAsiento(int cantidadDeAsiento) {
        this.cantidadDeAsiento = cantidadDeAsiento;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "cantidadDeAsiento=" + cantidadDeAsiento +
                "} " + super.toString();
    }
}
