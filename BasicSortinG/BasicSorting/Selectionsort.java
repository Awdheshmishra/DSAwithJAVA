package DSA.BasicSorting;

public class Selectionsort {
    public static void  print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {44,5,3,-6,5,3};

        // minimum value code
//        int min = Integer.MAX_VALUE;//for minimum value
//        int n = arr.length;
//        int mindx = -1;//index batyega
//        for(int i =0; i<n; i++){
//            if(arr[i]<min){
//                min = arr[i];
//                mindx = i;
//            }
//        }
//        System.out.println(min+" "+mindx);

        //selection sort
        int n = arr.length;
        print(arr);
        for(int i=0; i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j =i ; j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}
        // Bubble sort is better than Selection sort