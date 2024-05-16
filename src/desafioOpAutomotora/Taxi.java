package desafioOpAutomotora;

public class Taxi extends Vehiculo {
    private int valorPasaje;

    public Taxi() {
    }

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "valorPasaje=" + valorPasaje +
                "} " + super.toString();
    }

    public void pagarPasaje(int montoCliente) {
        int vuelto = 0;
        if (montoCliente >= valorPasaje) {
            vuelto = montoCliente - valorPasaje;
            System.out.println("Pago realizado su Vuelto es: " + vuelto);
        } else {
            System.out.println("Monto insuficiente. " + montoCliente + " El pago total es: " + valorPasaje);
        }

    }
}
