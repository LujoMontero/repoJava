package desafíoReciclaJeans;

public class UtilidadRJ {
    public static void limpiarPantalla() {

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("Ocurrió un error al esperar: " + e.getMessage());
        }
    }
}
