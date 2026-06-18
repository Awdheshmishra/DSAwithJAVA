package conditional;

import java.util.Scanner;

public class fivedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check: ");
        int n = sc.nextInt();

        if(n>9999 && n<100000){
            System.out.println("five digit number");
        }
        else {
            System.out.println("not five digit number");
        }
    }
}
