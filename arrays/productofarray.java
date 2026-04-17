package DSA.arrays;

public class productofarray {
    public static void main(String[] args) {
        int [] arr={3,4,5};
        int pro=1;
        for (int i=0; i<arr.length; i++){
            pro*=arr[i];
        }
        System.out.println(pro);

    }
}
