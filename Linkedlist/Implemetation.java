package Linkedlist;
import javax.management.StandardEmitterMBean;
import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;
class SLL{
    //user defined data structure
    private Node head;
    private Node tail;
    private int size ;
    void insertAtTail (int val){
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail =temp;
        }
        size++;
    }
    void insertAtHead (int val){
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else{
           temp.next = head;
           head = temp;
        }
        size++;
    }
    void insert (int idx, int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size) {
            insertAtTail(val);
            return;
        }
        if (idx>size || idx<0){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i =1; i<=idx-1; i++){
            x= x.next;
        }
        //insertion part
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    //get element
    int get(int idx) throws Error{
        if(idx==size-1) {
            return tail.val;
        }
        if(idx>=size || idx<0){
//            System.out.println("invalid index");
//            return -1;
            throw new Error("bhai error");

        }
        Node temp = head;
        for (int i =1; i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void set (int idx, int val) throws Error{
        if(idx==size-1){
            tail.val =val;
        }
        if(idx>=size || idx<0){
            throw new Error("bhai erroe hai");
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead() throws Error{
        if(head==null) throw new Error("List is empty");
        head = head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if(idx==0){
            deleteAtHead();
            return;
        }
        if (idx<0 || idx>=size)
            throw new Error("invalid index");
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            if (temp.next == tail) tail = temp;
            temp.next = temp.next.next;
            size--;

    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("length of ll is: " + size);
    }
}
public class Implemetation {
    public static void main(String[] args) {
        SLL list = new SLL();
        //list.size();

       /* list.insertAtTail(10);
        list.insertAtTail(30);
        list.insertAtTail(483);
        list.insertAtTail(95);
        list.display();

        list.size();

        list.insertAtTail(59);
        list.display();//add at end
        list.size();

        list.insertAtHead(9084);
        list.display();//add at first
        list.size();*/

        //insertion
        list.insertAtTail(29);
        list.insertAtTail(30);
        list.insertAtTail(31);
        list.display();
        list.insert(2,100);
        list.insert(3,4848);
        list.display();
        list.insert(10,43);
        list.display();
        list.deleteAtHead();
        list.display();

        //System.out.println(list.get(-1));

//        list.insertAtEnd(10);
//        list.insertAtEnd(20);
//        list.insertAtEnd(30);
//        list.insertAtEnd(40);
//        list.display();
//        list.insertAtEnd(24);
//        list.display();
    }
}

//linked list me gr element ko shift krna hai to bs direct ho jata ye array me nhi hota hai
