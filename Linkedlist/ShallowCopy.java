package Linkedlist;
public class ShallowCopy {
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.val);
        Node temp = a; //shallow copy
        //Node temp = new Node(100);
        temp.val = 12;
        System.out.println(a.val);

    }
}
