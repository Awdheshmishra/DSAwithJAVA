package Linkedlist;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class awdh {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Call display with the head node
        display(head);
    }

    public static void display(Node head) {
        if (head == null)
            return;
        display(head.next);
        System.out.println(head.val);
    }
}
