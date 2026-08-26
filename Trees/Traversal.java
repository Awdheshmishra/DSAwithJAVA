package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
       /* System.out.print("original tree is: ");
        display(a);
        System.out.println();*/
        System.out.print("preorder is: ");
        preorder(a);
        System.out.println();
        System.out.print("inorder is: ");
        inorder(a);
        System.out.println();
        System.out.print("postorder is: ");
        postorder(a);
        System.out.println();
        System.out.print("level order traversal: ");
        levelOrder(a);
        System.out.println();
    }
   /* private static void display(Node root){
        if (root==null) return;//base case
        System.out.print(root.val+" ");//self
        display(root.left);//left subtree
        display(root.right);//right subtree
    }*/
    private static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while (q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if (front.right!=null) q.add(front.right);
        }
    }
    private static void preorder(Node root){
        if (root==null) return;//base case
        System.out.print(root.val+" ");//self
        preorder(root.left);//left subtree
        preorder(root.right);//right subtree
    }
    private static void inorder(Node root){
        if (root==null) return;//base case
        inorder(root.left);//left subtree
        System.out.print(root.val+" ");//self
        inorder(root.right);//right subtree
    }
    private static void postorder(Node root){
        if (root==null) return;//base case
        postorder(root.left);//left subtree
        postorder(root.right);//right subtree
        System.out.print(root.val+" ");//self
    }
}
