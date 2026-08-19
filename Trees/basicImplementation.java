package Trees;
public class basicImplementation {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
        public static void main(String[] args) {
            Node a = new Node(1);
//            Node b = new Node(41);
            Node b = new Node(0);
            Node c = new Node(3);
            Node d = new Node(2);
            Node e = new Node(6);
            Node f = new Node(5);

            System.out.println(a.left);
            System.out.println(a.right); // these return null value bcz these are not assigned
            //assigning the value to the node
            a.left=b; a.right=c;
            b.left=d; b.right=e;
            c.right=f;
            System.out.println(b.val);
            System.out.println(a.left.val);
            System.out.println(a.left.right.val);
            System.out.println(e.val);

            //changing value
            /*e.val=90;
            System.out.println(e.val);*/
            display(a);
            System.out.println();
            System.out.println(sum(a));
            System.out.println(prod(a));
            System.out.println(maximum(a));
            System.out.println(minimum(a));
            System.out.println(prodNonZero(a));
        }

        //display
        private static void display(Node root){
            if (root==null) return;//base case
            System.out.print(root.val+" ");//self
            display(root.left);//left subtree
            display(root.right);//right subtree
        }

        //sum of tree nodes
        private static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
        }

        //product of tree nodes
        private static int prod(Node root){
        if(root==null) return 1;
        return root.val*prod(root.left)*prod(root.right);
        }

        //find node with maximum value
        private static int maximum(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maximum(root.left),maximum(root.right)));
        }

        //find product of non-zero elements of nodes
        private static int prodNonZero(Node root) {
            if (root == null) return 1;
            if (root.val == 0) {
                return prodNonZero(root.left) * prodNonZero(root.right);
            }
            return root.val * prodNonZero(root.left) * prodNonZero(root.right);
        }

        //find node with minimum value
        private static int minimum(Node root){
            if(root==null) return Integer.MAX_VALUE;
            return Math.min(root.val,Math.min(minimum(root.left),minimum(root.right)));
        }



}
