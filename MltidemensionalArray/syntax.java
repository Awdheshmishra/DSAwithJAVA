package MltidemensionalArray;

import java.util.Scanner;

public class syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];
        System.out.println("enter the element");

//        int m = arr.length;//row ki length batata no. of rows
//
//        int n = arr[0].length;//no. of cols in each row


        //input of 2D array-

        for(int i = 0; i<3; i++){//rows
            for(int j=0; j<3; j++){//column
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<3; i++){
            for(int j=0; j< 3; j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
}
//2D arrays array of arrays hota hai
