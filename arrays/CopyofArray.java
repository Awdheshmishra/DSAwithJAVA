package DSA.arrays;

import java.util.Arrays;

public class CopyofArray {
    public static void main(String[] args) {
        int [] arr = {12,23,34,45,11,22};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    //        int [] nums = arr; // shallow copy
    //        nums[3] = 33;
    //        System.out.println(arr[3]);
    //        System.out.println(nums[3]);

        // deep copy

        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 70;
        System.out.println(arr[0]);

    }
}
