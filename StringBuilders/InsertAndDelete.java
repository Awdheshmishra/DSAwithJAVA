package StringBuilders;

public class InsertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
//        sb.delete(2,6);//it delete the index from 2 to 5 yani ki 0 to n-1
//        System.out.println(sb);
//        sb.deleteCharAt(3);//it will delete particular element
//        System.out.println(sb);
//
        sb.insert(2,true);//particular index par add krta hai element koo
        System.out.println(sb);
    }
}
