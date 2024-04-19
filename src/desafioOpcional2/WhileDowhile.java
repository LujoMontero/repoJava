package desafioOpcional2;

import java.util.Scanner;

public class WhileDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i<50) {
            i+=1;
            System.out.printf("Iteración %d\n", i);
        }
        //Convertir el código anterior utilizando la sentencia do while
        //ejercicio 1
        int i2 = 0;
        do {
                i2+=1;
                System.out.printf("Iteración %d\n", i2);
        } while (i2<50);




    }
}
