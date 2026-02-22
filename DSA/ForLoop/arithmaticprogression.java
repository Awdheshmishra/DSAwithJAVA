package DSA.ForLoop;

import java.util.Scanner;

public class arithmaticprogression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n =  sc.nextInt();
        int i;
        for (i=4;i<=3*n+1;i+=3)
            System.out.println(i);


        //method 2 without using formula:

        //int a=4 ;
        //int d=4;
        //for(i=1;i<=n;i++)
//        System.out.println(a);`
//        a+=d;
    }
}
