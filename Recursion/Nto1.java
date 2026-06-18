package Recursion;
import java.util.Scanner;
public class Nto1 {
    public static void print(int n){
        if(n==1) return ;
        System.out.println(n);
        print(n-1);
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        print(n);
        System.out.println();

    }
}
//decreasing