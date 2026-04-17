package patterns;

import java.util.Scanner;

public class alphabetsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n; j++){
                System.out.print((char)(j+64)+" ");   // for A 64 for a 97
                // Z 90    z  122
            }
            System.out.println();
        }

    }
}
