package Recursion;

import java.util.Scanner;

public class Increasing {
    /* package whatever; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */

        static int n ;
        public static void print(int x){
            if(x>n) return ;
            System.out.println(x);
            print(x+1);
        }
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter n");

            int n = sc.nextInt();
            print(1);

        }
    }

