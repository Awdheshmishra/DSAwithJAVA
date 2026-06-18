package DSA.arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 2;
        //k=2 ka matlab hai starting ke 2 element ko pakad ke end me rakh do
        int[] res = {};
        for (int ele : arr)
            System.out.print(ele + " ");

        int j = n - 1;
        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}


