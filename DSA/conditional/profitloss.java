package DSA.conditional;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter selling price");
        int sp=sc.nextInt();
        System.out.println("enter cost price");
        int cp=sc.nextInt();

        if(sp>cp) System.out.println("profit is "+(sp-cp));
        if (cp>sp) System.out.println("loss is "+(cp-sp));

        else System.out.println("no profit no loss");
    }
}
   // if we are creationg only 2 if condition without else and the cp ans sp values are same then the output is null
//but if we give one if and only else conditon and cp and sp values are same then the output is showing LOSS