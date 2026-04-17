package conditional;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number for check");
            int n=sc.nextInt();

            if(n%2==0) System.out.println("even number");


           // if(n%2!=0) System.out.println("odd number");

            //gr 2 if condition likhenge to dono if check hoga gr if else likhte to keval ek hi chiz check hota chahe if ya else..


            else System.out.println("odd");
    }
}
