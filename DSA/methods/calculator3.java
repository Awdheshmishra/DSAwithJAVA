package DSA.methods;

public class calculator3 {
    int res;
    void add(int x, int y)
            // formal parameter or PARAMETER
    {
        res = x+y;
        System.out.println(res);
    }
}
class la{
    public static void main(String[] args) {
        calculator3 calc = new calculator3();
        int a=10;
        int b=30;
        calc.add(a,b);
        //ACTUAL PARAMETER OR arguments
    }

}
