package Recursion;
import java.util.Scanner;
public class LogrithimicPower {
    public  static  int pow(int a, int b){//tc = O(b)
        if(b==0) return 1; //base case
        return a*pow(a,b-1);
    }
    public  static  int pow2(int a, int b){// T.c = O(log b)
        if(b==0) return 1; //base case
        int ans = pow(a,b/2);
        if(b%2==0) return ans * ans;
         else return ans * ans *a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base:");
        int a = sc.nextInt();
        System.out.println("enter power: ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power of "+ b+ " is " +  pow2(a,b));
    }
}
