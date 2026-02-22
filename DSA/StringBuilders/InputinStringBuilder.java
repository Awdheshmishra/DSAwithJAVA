package StringBuilders;

import java.util.Scanner;

public class InputinStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'a');
        System.out.println(sb);


    }
}
