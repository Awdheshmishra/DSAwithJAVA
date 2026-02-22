package DSA.BasicSorting;
import java.util.Arrays;
public class BuiltinSort {
    public static void main(String[] args) {
        int arr [] = {-4,3,5,3,2,4,3,42};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
