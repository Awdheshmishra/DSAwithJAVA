package Stack;

import java.util.Scanner;
import java.util.Stack;

public class moveStackinSameOreder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(9);
        st.push(1);
      /*  int n;
        System.out.println("Enter the number of element you want to insert: ");
        n = sc.nextInt();
        System.out.println("enter the elements");
        for (int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
       */
        System.out.println(st);
        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            //int x = st.peek();
            rt.push(st.pop());
           // st.pop();
        }
        System.out.println(rt);
    }
}
