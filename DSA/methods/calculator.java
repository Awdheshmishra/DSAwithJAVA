package DSA.methods;

class calculator {
    int a , b , res;
    void add()
            //method declaration
    {
        a=10;
        b=12;
        res=a+b;
        System.out.println(res);
    }
}
 class launch{
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.add();
        //method call or method invocation
    }
}
