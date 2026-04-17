package conditional;

import java.util.Scanner;

public class findyounger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of shyam");
        int age1 = sc.nextInt();
        System.out.println("enter the age of ram");
        int age2 = sc.nextInt();
        System.out.println("enter the age of dhyam");
        int age3 = sc.nextInt();

        if (age1<age2){
            if(age1<age3)
                System.out.println(age1+" is younger");
            else
                System.out.println(age3+" is younger");
        }
        else {
            if (age2<age3)
                System.out.println(age2+" is younger");
            else System.out.println(age3+" is younger");
        }
    }
}
