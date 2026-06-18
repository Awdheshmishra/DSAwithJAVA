package Recursion;
public class ArrayTraversal {
    public  static void print(int i, int arr[]){
        if(i== arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int [] arr ={ 12,231,32,42,42,21};
        print(0,arr);
    }
}
//recursive code