package StringBuilders;

public class AppendMethod {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append(434);
        System.out.println(sb);
        sb.append("%&#$@");
        System.out.println(sb);
        char [] ch = {'2','r','t'};
        sb.append(ch);
        System.out.println(sb);
    }

}
//add element in last that you want