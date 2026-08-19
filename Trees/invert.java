package Trees;

public class invert {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.print("original tree is: ");
        display(a);
        System.out.println();
        swap(a);
    }
     private static void display(Node root){
        if (root==null) return;//base case
        System.out.print(root.val+" ");//self
        display(root.left);//left subtree
        display(root.right);//right subtree
    }
     private static void swap(Node root){
        if (root==null) return;//base case
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        System.out.print(root.val+" ");
        swap(root.left);
        swap(root.right);
    }

}
