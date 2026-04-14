package DSA.arrays;

public class passingArrays {
    public static void main(String[] args) {

        // PASS BY VALUE : GAR KISI INTEGER KO DUSRE METHOD ME BHEJTE HAIN TO USE PASS BY VALUE KHTE HAIN
//        int x=5;
//        System.out.println(x);
//        change(x) ;
//        System.out.println(x);
//        tudfj(x);
//    }
//    private static void tudfj(int x) {
//        int t=54;
//        System.out.println(t);
//    }
//    public  static void change(int x) {
//        int s=3;
//        System.out.println(s);


        // PASS BY REFRENCE : GR KISI ARRAY KO METHOD ME BHEJTE HAIN TO USE PASS BY REFRENCE KHTE HAIN

        int [] arr = { 23,14,54,22};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr){
        arr[0]=90;
    }
}
