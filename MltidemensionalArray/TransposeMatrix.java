package MltidemensionalArray;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{5,6,7},{6,9,0},{9,7,5}};
        int m = arr.length;
        int n = arr[0].length;


//        for(int j = 0; j<n; j++){
//            for(int i=0; i<m; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
        //simply transpose without storing
//        }
        System.out.println();


        //storing

        int [][] transpose = new int[n][m];
        for (int i =0; i<n;i++) {//cols
            for (int j = 0; j < m; j++) {//rows
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }
    }
}
