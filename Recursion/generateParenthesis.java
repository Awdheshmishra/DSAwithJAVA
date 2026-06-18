package Recursion;
import java.util.Scanner;
public class generateParenthesis {
    public static void print(int open, int close, int n, String s){
        if(s.length() ==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) print(open+1, close, n, s+"(");
        if(close<open) print(open, close+1, n, s+")");
        //agar opening bracket daal rhe to opening ka count badh ja rha
        // aur agr closing daal rhe to closing ka count badh ja rha hai
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        print(0,0,n,"");
    }
}
