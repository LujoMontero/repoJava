import java.util.Scanner;

public class temporal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n ==1 ) {
                    System.out.print("*");
                }else if ((i == 0 && j != n - 1) || (i == n - 1 && j != 0) || !(j == 0 || j == n - 1))  {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
