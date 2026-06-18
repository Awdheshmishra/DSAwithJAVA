package Recursion;
import java.util.ArrayList;
public class subset {
    static ArrayList<String> arr = new ArrayList<>();//global varibale
    public  static void  printsubsets(int i, String  s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printsubsets(i+1,s,ans+ch);//this will add character (take)
        printsubsets(i+1,s,ans);//this will not add the character(not take)
    }
    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>();//reset
        printsubsets(0,s,"");
        System.out.println(arr);
    }
}
