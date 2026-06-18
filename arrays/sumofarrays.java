package DSA.arrays;

public class sumofarrays {
    public static void main(String[] args) {
        int[] arr = {23,34,45,67,788,89,90,};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        System.out.println(sum);
    }
}
