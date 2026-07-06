package Stack;
import java.util.Stack;
public class Insertion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(5);
        st.push(0);
        st.push(1);
        st.push(7);
        System.out.println(st);
        int idx = 3; //index
        int x = 12;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        //push at bottom
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
