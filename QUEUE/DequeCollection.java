package QUEUE;
import java.util.Deque;
import java.util.LinkedList;
public class DequeCollection {
    //doubly ended queue
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println(dq); // 1 2 3
        dq.addFirst(4);
        System.out.println(dq); // 4 1 2 3

        dq.removeLast();
        System.out.println(dq);// 4 1 2
        dq.removeFirst();
        System.out.println(dq); // 1 2

        System.out.println(dq.getFirst()); // 1
        System.out.println(dq.getLast()); // 2

         dq.add(3); //adding at the last
        System.out.println(dq);

        dq.remove(); // removing at the first
        System.out.println(dq);
    }
}
