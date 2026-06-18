package DSA.arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {540,54,1,2,3,6,23};
        int mx= arr[0];
        for ( int i=1; i<arr.length; i++) {
            if (arr[i] > mx)//for maximum value
                mx = arr[i];
        }
        int smx = Integer.MIN_VALUE;
        for (int i=1; i<arr.length;i++){
            if ( arr[i]>smx &&arr[i] != mx)
                smx = arr[i];

        }
        System.out.println(mx);
        System.out.println(smx);

    }
    }


