package DSA.ForLoop;

import java.util.Scanner;

public class geometricprogression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        //1,3,9,27
        int a = 1;
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println(a);
            a *= 3;
        }
    }
}
