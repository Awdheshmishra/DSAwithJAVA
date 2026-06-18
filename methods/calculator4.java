package methods;

public class calculator4 {
    int res;

    int add(int x, int y){
        res = x+y;
        return  res;
    }

}
class lauu {
    public static void main(String[] args) {
        calculator4 calc = new calculator4();

        int a=13;
        int b=43;
        int sum = calc.add(a,b);
        System.out.println(sum);
    }
}
