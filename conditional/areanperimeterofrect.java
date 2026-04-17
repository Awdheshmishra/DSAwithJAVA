package conditional;

import java.util.Scanner;

public class areanperimeterofrect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter lenth of rectangle: ");
        double l= sc.nextDouble();
        System.out.println("enter width of rectangle: ");
        double w = sc.nextDouble();

        double A=w*l;
        System.out.println(A);
        double P=2*(l+w);
        System.out.println(P);

        if (A>P){
            System.out.println("area is greater than perimeter: "+A);
        }
        else
                System.out.println("perimeter is greater than rectangle: "+P);

    }
}
