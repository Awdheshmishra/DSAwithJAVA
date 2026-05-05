package Linkedlist;
class Node{
    int val;
    Node next;
    Node (int val) {
        this.val = val;
    }
}
public class basic {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        Node temp = a;
        //for(int i=1;i<=5;i++){
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
    }
}
