package patterns;

import java.util.Scanner;

public class starsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of line you want to print");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}