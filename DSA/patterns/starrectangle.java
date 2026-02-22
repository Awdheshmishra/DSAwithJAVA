package DSA.patterns;



import java.util.Scanner;

public class starrectangle {
    public static void main(String[] args) {

        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and cols: ");
        m = sc.nextInt();
        n = sc.nextInt();

        for (int i = 1; i <=m; i++){//rows
            for (int j = 1; j <= n; j++) {// coloums
            System.out.print("* ");
        }
        System.out.println();

    }
    }
}
