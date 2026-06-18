package MltidemensionalArray;

public class LargestElement {
    public static void main(String[] args) {
        int [][] arr =  {{1,2,3,4},{-3,5,6,7},{10,9,29,5}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++){
            for( int j =0; j < n; j++){
                mx = Math.max(mx, arr[i][j]);
            }
            System.out.println("largest element in each row is : "+mx);
        }
        System.out.println("largest element from whole array is: "+mx);
    }
}
