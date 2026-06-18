package DSA.arrays;

import java.util.ArrayList;

public class BasicsofArrayList {

    // array me fixed size hota hai pr isme jitna man utna size de skte hain
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(7);
        // jab INITIAL CAPACITY DENGE TO HI .add me (index, element ) denge nhi to keval element denge
        arr.add(0,10);// for initialization we use .add method
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        arr.add(6,70);
        arr.add(7,80);

//        System.out.println(arr);
        for (int i=0; i<arr.size();i++)
            System.out.print(arr.get(i)+ " ");

        // for print the element we  use .get method
        System.out.println();
        arr.set(2,300);  // for updating the value of array list
        for (int i=0;i<8;i++){
            System.out.print(arr.get(i)+" ");
        }
    }

}
