package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {12,23,34,54,65,768,987};
        int n = arr.length;
        int target = 43;
        int ub= n;
        int lo = 0, hi = n-1;
        while (lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>=target){
                ub = Math.min(ub,mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(ub);
    }
}
