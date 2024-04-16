package desafioOpcional;

import java.util.Scanner;


public class resistencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r1, r2, r3;

        do {
            System.out.println("Ingrese un número positivo para resistencia 1: ");

            if (sc.hasNextFloat()) {
                r1 = sc.nextFloat();

                if (r1 >= 0) {
                    System.out.println("Resistencia agregada: " + r1);
                } else {
                    System.out.println("Por favor, ingrese un número positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                sc.next(); // descarta la entrada no válida
                r1 = -1; // establece r1 a un valor negativo para que el bucle continúe
            }

        } while (r1 <= 0); // Continua el bucle mientras r1 no sea positivo

        do {
            System.out.println("Ingrese un número positivo para resistencia: ");

            if (sc.hasNextFloat()) {
                r2 = sc.nextFloat();

                if (r2 >= 0) {
                    System.out.println("Resistencia agregada: " + r2);
                } else {
                    System.out.println("Por favor, ingrese un número positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                sc.next();
                r2 = -1;
            }

        } while (r2 <= 0);

        do {
            System.out.println("Ingrese un número positivo para resistencia: ");

            if (sc.hasNextFloat()) {
                r3 = sc.nextFloat();

                if (r3 >= 0) {
                    System.out.println("Resistencia agregada: " + r3);
                } else {
                    System.out.println("Por favor, ingrese un número positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                sc.next();
                r3 = -1;
            }

        } while (r3 <= 0);


        System.out.println("resistencia 1 = " + r1);
        System.out.println("resistencia 2 = " + r2);
        System.out.println("resistencia 3 = " + r3);

        // Calcular resistencia total
        double rtotal = 1 / ((1 / r1) + (1 / r2) + (1 / r3));

        // Mostrar resultado
        System.out.println("La resistencia total es: " + rtotal);

    }
}
