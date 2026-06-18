package DSA.BasicSorting;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,7,9,22};
        int n = arr.length;
        boolean flag = true;
        for(int i = 0; i < n-1;i++){
            if(arr[i] > arr[i+1])
            {
                flag = false;
                break;
            }
        }
        if(flag == true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
