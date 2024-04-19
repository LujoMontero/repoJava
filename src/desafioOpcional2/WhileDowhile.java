package desafioOpcional2;

import java.util.Scanner;

public class WhileDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int i = 0;
//        while (i<50) {
//            i+=1;
//            System.out.printf("Iteración %d\n", i);
//        }
//        //Convertir el código anterior utilizando la sentencia do while
//        //ejercicio 1
//        int i2 = 0;
//        do {
//                i2+=1;
//                System.out.printf("Iteración %d\n", i2);
//        } while (i2<50);

        //Ejercicio - Solo pares

        System.out.println("limite de pares:");
        int limite = sc.nextInt();
        int contador = 0;
            for (int i=0;contador<limite;i++){

                if (i%2==0){
                    System.out.println(i);
                    contador++;
                }

            }

        System.out.println("-----------------------");

        int contador2 = 0;
        for (int i=1;contador2<limite;i++){

            if (i%2==0){
                System.out.println(i);
                contador2++;
            }

        }





    }
}
