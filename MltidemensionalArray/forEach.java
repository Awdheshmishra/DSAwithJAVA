package MltidemensionalArray;

public class forEach {
    public static void main(String[] args) {

        // for 1D arrays
        int [] a= {2,3,4,5};
        for(int ele : a){
            System.out.print(ele);
        }
        System.out.println( );

        //for 2D arrays
        int[][] b = {{1,2,3,4},{5,6,7,8}};
        for(int[] ele : b){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();

        }
    }
}
