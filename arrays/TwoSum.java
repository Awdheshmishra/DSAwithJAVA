package DSA.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[]  arr ={12,1,3,4,5,2,6,-3};
        int n = arr.length;
        int t=9;
        for (int i =0; i<n; i++)
            for (int j= i+1; j<n; j++)
                if (arr[i]+arr[j]==t)
                    System.out.println(arr[i]+" "+arr[j]);
    }
}
