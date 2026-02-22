package StringBuilders;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s");
        String s = sc.nextLine();
        System.out.println("enter t");
        String t = sc.nextLine();
        char [] a=  s.toCharArray();
        char [] b= t.toCharArray();
        if(s.length()!= t.length()) {
            System.out.println("not anagrams");
            return;
        }

        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++) {
            if (a[i] != b[i]) {
                System.out.println("not anagram");
                return;

                }
             }

        System.out.println("they are anagrams");
    }
}
