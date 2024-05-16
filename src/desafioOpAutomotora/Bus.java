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
    public void asientosDisponibles(int asientos) {
        int disponibleRestantes=0;
        if(asientos<cantidadDeAsiento){
            disponibleRestantes = cantidadDeAsiento - asientos;
            System.out.println("Asientos disponibles restantes = " + disponibleRestantes);
        } else {
            System.out.println("no tenemos disponibilidad para= " + asientos + ". Solo hay capacidad para= " + cantidadDeAsiento);
        }



    }
}
