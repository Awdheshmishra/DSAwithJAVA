package DSA.conditional;

import java.util.Scanner;

public class oroperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("number is divisible by 3 or 5");

        }
        else {
            System.out.println("not divisible by 3 or 5");
        }
    }
}
