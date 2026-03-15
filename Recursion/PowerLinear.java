package Recursion;
import java.util.Scanner;
public class PowerLinear {
    public  static  long pow(long a, long b){
//        if(a==0 || b==0){
//            System.out.println("not defined");
//            return -1;
//        }
        if(b==0) return 1; //base case
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base:");
        long a = sc.nextInt();
        System.out.println("enter power: ");
        long b = sc.nextInt();
        System.out.println(a + " raised to the power of "+ b+ " is " +  pow(a,b));
    }
}
