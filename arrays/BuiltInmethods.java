package DSA.arrays;


import java.util.Arrays;

public class BuiltInmethods {
    public static void main(String[] args) {
        int [] arr = {120, 230, 34, 46755, 58756, 67, };
//        for (int i=0;  i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
        //for each loop
        for(int ele : arr)
            System.out.print(ele+" ");
        Arrays.sort(arr);
        System.out.println();
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
}
