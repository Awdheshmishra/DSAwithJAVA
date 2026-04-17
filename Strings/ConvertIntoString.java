package Strings;

import java.util.Scanner;

public class ConvertIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        String s = ""+ n;
        System.out.println(s);

    }
}
