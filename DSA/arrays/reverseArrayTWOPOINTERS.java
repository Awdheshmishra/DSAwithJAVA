package DSA.arrays;

public class reverseArrayTWOPOINTERS {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70};
        int n = arr.length;

        for (int ele :  arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //reverse

        //ONE POINTER METHOD
//        for (int i=0;i<n/2;i++) {
//            int j = n - 1 - i;
//            int temp = arr[i];
//            arr[i]= arr[j];
//            arr[j] = temp;
//
//        }

        //  TWO POINTER METHOD

        // if we want to reverse some element only then:-
        // int i=1, j=5;
         int i=0;
         int j=n-1;
         while(i<=j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
         }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
