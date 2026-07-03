package Stack;

import java.util.ArrayList;
import java.util.Stack;
//LIFO/FILO
public class basicsofStack {
    public static void main(String[] args) {
//        int arr [] = new int[5];//arr
//        ArrayList<Integer> arr = new ArrayList<>();//arraylist
        Stack<Integer> st = new Stack<>();
        //boolean expression
        System.out.println(st.isEmpty());
        //push
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(9);
        //peek -- return last element means top most element
        System.out.println(st.peek());
        System.out.println(st);
        //pop
        st.pop();//deleting top most elementn
        System.out.println(st);
        //size
        System.out.println("size is " + st.size());
        //printing the element of the stack
        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

        System.out.println(st.isEmpty());

        //fyade --> unlimited size hota,discipline deta hai isme ham sb top se hi kar skte hain
        //S.C (n) for get the element, O(n) T.C for get element

    }
}
