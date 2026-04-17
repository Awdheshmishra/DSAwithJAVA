package StringBuilders;

import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String s =  "raghav";
        char [] ch= s.toCharArray();
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
