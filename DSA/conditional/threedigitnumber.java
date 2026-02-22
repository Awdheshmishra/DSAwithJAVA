package DSA.conditional;

import java.util.Scanner;

public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check: ");
        int n = sc.nextInt();

        if(n>99 && n<1000){
            System.out.println("three digit number");
        }
        else {
            System.out.println("not three digit number");
        }
    }
}
