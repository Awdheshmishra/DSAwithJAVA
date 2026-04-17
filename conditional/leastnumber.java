package conditional;

import java.util.Scanner;

public class leastnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();

        System.out.println("enter second number: ");
        int b = sc.nextInt();

        System.out.println("enter third number: ");
        int c = sc.nextInt();

        if(a<c && a<b)
            System.out.println(a+" is least");
        else if(b<a && b<c)
            System.out.println(b+" is least");
        else if(c<a && c<b)
            System.out.println(c+" is least");

        else System.out.println("all are equals: ");
    }

}
