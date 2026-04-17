package MltidemensionalArray;

public class SumOfAllElement {
    public static void main(String[] args) {
        int [] [] arr = {{12,3,4},{-4,6,-5},{23,54,67}};
        int sum = 0;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("sum of all elements are: "+sum);
    }
}
