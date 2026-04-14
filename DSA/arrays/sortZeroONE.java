package DSA.arrays;

public class sortZeroONE {
    public static void main(String[] args) {
       // int [] arr = { 1,0,1,0,0,2,1,0,1,2,1,2};

        int [] arr = {1,0,1,0,0,0,1,1,0,1,0};

        int NoOfZeros = 0, NoOfOnes = 1;

        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i] == 0 ) NoOfZeros++;
            else arr[i]= 1;
            //else if(arr[i] == 1) NoOfOnes ++;
        }
        for(int i =0; i<n; i++){
            if(i < NoOfZeros) arr[i] = 0;
           // else if (i< NoOfOnes) arr[i] = 1;
            else arr[i] = 1;
        }

        for ( int ele : arr){
            System.out.println(ele +" ");
        }
    }
}
