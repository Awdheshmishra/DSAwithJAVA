package DSA.ForLoop;

import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int x=0;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                System.out.println("composite number");
                x=1;
                break;
            }
        }
        if (n==1) System.out.println("neither prime nor composite");
        else if (x==0) System.out.println("prime number");
    }
}
//gr break na lagayenge to baar baar composite number print hoga jitne factor honge utne baaar print hoga