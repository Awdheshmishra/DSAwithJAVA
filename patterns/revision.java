package patterns;
import java.util.Scanner;
public class revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        // 0. STAR SQUARE

        for (int i=1;i<=n;i++){
            for (int j=1; j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //  1. NUMBER SQUARE

       /* for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/


        // 2.  ALPHABET SQUARE

      /*  for (int i =1; i<=4; i++){
            for (int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" "); //for capital letters
//                System.out.print((char)(j+97)+" "); //for small letters
            }
            System.out.println();
        }*/

        //  3. NUMERIC AND ALPHABET TRIANGLE

       /* for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print((char)(j+64) + " ");
                }
                else {
                    System.out.print(j+" ");
                }
            }
                System.out.println();
        }*/

        //4 . REVERSE TRIANGLE

       /* for (int i=1;i<=n;i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/


        //  5. ODD TRIANGLE

       /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*j-1+ " ");
            }
            System.out.println();
        }*/

        //  6. FLOYD TRIANGLE

        /*int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+ " ");
                a++;
            }
            System.out.println();
        }*/

         // 7. STAR PLUS


        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==n/2+1 || j==n/2+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }*/

            // 8. STAR CROSS

       /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j || i+j ==6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


        //  9.  binary triangle


        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2==1) {
                    if (j % 2 == 1) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                else {//(i%2==0)
                    if(j%2==0){
                        System.out.print(1);
                    }
                    else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }*/


        //    10.     star filliped triangle

       /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ( i+j >n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


    //      11.   number triangle flipped --> composite pattern -- mixture of two pattern into one pattern

        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" "+ " ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        //       12.  Rhombus

       /* for (int i = 1; i <= n; i++) {//rows
            for (int j = 1; j <= n-i; j++) {//spaces
                System.out.print(" "+ " ");
            }
            for(int j=1; j<=n;j++){//star
                System.out.print("*" + " ");
            }
            System.out.println();
        }*/

        // 13.  star pyramid

       /* for (int i = 1; i <= n; i++) {//rows
            for (int j = 1; j <= n-i; j++) {//spaces
                System.out.print(" "+ " ");
            }
            for(int j=1; j<=2*i-1;j++){//star
                System.out.print("*" + " ");
            }
            System.out.println();
        }*/

        //  14.  Number pyramid palindrome

      /*  for (int i = 1; i <= n; i++) {//rows
            for (int j = 1; j <= n-i; j++) {//spaces
                System.out.print(" "+ " ");
            }
            for(int j=1; j<=i;j++){//star
                System.out.print(j + " ");
                }
            for (int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/


        // 15.  STAR BRIDGE

       /* for (int i =1;i<=2*n-1;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
            n--;
        for (int i=1; i<=n; i++) {//rows
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j<=n+1-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }*/

        // 16.  NUMBER BRIDGE

        /*for (int i =1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        int nsp = 1;
        for (int i=1; i<=n; i++) {//rows
            int a=1;
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(a++ +" ");
            }
            for (int j = 1; j <=nsp; j++) {
                System.out.print(" " + " ");
                a++;
            }
            nsp+=2;
            for (int j = 5; j<=n+5-i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }*/

        // 17.  STAR DIAMOND

        /*int nsp = n-1;
        int nst = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for (int j =1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nsp=1;
        nst = nst-4;
        for (int i=1;i<=n-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }*/

        // 18. NUMBER SPIRAL

       /* for (int i=1;i<2*n-1;i++){
            for (int j=1;j<=2*n-1;j++){
                int a = i, b=j;
                if(i>n) a=2*n-i;
                if(j>n) b=2*n-j;
                System.out.print(n+1-Math.min(a,b)+" ");
            }
            System.out.println();
        }*/
    }
}

