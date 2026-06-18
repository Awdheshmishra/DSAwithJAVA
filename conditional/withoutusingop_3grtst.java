package conditional;

import java.util.Scanner;

public class withoutusingop_3grtst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();

        System.out.println("enter second number: ");
        int b = sc.nextInt();

        System.out.println("enter third number: ");
        int c = sc.nextInt();

        //here we'll not use operator only solve with nested condition:

        if (a>b)
        {
            if(a>c) System.out.println(a+"is greatest:");
            else //c>a>b
                System.out.println(c+" is greatest");
        }
        else {  //b>a
            if (b > c) System.out.println(b + " is greatest: ");
            else // c>a>b
                System.out.println(c + " is greatest: ");
        }

    }
}
