package conditional;
// absolute number means positive number & if given number is integer then make it positive

import java.util.Scanner;

public class absolutenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        if(n<0) System.out.println(-n);
        else System.out.println(n);
    }

}
