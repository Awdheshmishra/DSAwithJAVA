package DSA.ForLoop;

import java.util.Scanner;

public class printtable {
    public static void main(String[] args) {

        //bekar code
//        for (int i=19;i<=190;i++)
//            if (i%19==0)
//                System.out.println(i);
        //170 br chl rha

        //efficient
//        for (int i=19;i<=190;i+=19)
//            System.out.println(i);

        //keval 10 br chl rh

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        for (int i=n;i<=10*n;i+=n)
            System.out.println(i);
    }
}
