package DSA.methods;

public class calculator2 {
    int a,b,res;
    int sub()
            //called method
    {
        a=10;
        b=12;
        res=a-b;
        return res;
    }
}
class l{
   //calling method
    public static void main(String[] args) {
        calculator2 calc=new calculator2();
        int minus= calc.sub();
        System.out.println(minus);

    }

}
