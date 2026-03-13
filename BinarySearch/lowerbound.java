package BinarySearch;

public class lowerbound {
    public static void main(String[] args) {
        int [] arr = {10,24,34,34,56,75,88,979};
        int n = arr.length;
        int target = 40;// lower bound ka matalb target se bda ele jo phle aaya ho
        int lb = n;
        int lo= 0, hi = n-1;
        while (lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(lb);
    }
}
