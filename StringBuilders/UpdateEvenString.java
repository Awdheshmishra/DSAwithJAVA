package StringBuilders;

import java.util.Scanner;

public class UpdateEvenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String s = sc.nextLine();
        String str = "";
        for(int i = 0; i <s.length(); i++){
            if(i%2==0) str += 'a';
            else str += s.charAt(i);
        }
        s= str;
        System.out.println(s);

    }
}
// strings gives poor performance because of immutability