package patterns;

 class calculator {
    int a;
    int b;
    int res;
    void add(){
        a=10;
        b=10;
        res=a+b;
        System.out.println(res);

    }
}
class launch {
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.add ();
    }
}