package DSA.arrays;

import java.util.Scanner;

public class inputofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element ");


//        int [] arr = new int[7];
//        for ( int i=0; i<=6; i++){
//            arr[i] = sc.nextInt();
//        }
//        //output
//        for (int i=0; i<=6;i++){
//            System.out.print(arr[i]+" ");
//        }


        //variable size input
        int n = sc.nextInt();

        int [] arr = new  int[n];

        for ( int i=0; i<=n-1;i++){
            arr[i]= sc.nextInt();
        }

        for (int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
