package desafioOpAutomotora;

public class MainAutomotora {
    public static void main(String[] args) {

        Taxi taxi = new Taxi(2500);
        taxi.pagarPasaje(1000);

        Bus bus = new Bus(10);
        bus.asientosDisponibles(6);
        bus.asientosDisponibles(13);

        MiniBus miniBus = new MiniBus("Azul", "XYZ123", 30, "Turismo");
        miniBus.imprimeBus();

    }
}
