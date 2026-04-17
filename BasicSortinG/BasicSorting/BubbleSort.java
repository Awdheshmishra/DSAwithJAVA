package DSA.BasicSorting;
public class BubbleSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {23,-5,-54,242,43};
        int n = arr.length;
        print(arr);
        for(int j = 0 ; j<n-1; j++){//for number of arrays
            boolean flag = true;
            for (int i = 0; i < n-1 - j; i++) {
                if(arr[i] > arr[i+1]) {//increasing order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        print(arr);
    }
}


