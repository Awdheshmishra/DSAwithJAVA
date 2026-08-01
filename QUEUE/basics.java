package QUEUE;
import java.util.*;

public class basics {
    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();  //inti--- 2 types
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(5);
        System.out.println(q);
        System.out.println(q.element());
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.size());
        System.out.println(q.isEmpty());


    }
}
