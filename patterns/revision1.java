package patterns;
import java.util.Scanner;
public class revision1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
       /* int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*j-1+ " ");
            }
            System.out.println();
        }*/

       /* int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+ " ");
                a++;
            }
            System.out.println();
        }*/


       /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==n/2+1 || j==n/2+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }*/

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j || i+j ==6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

