public class BinaryTree {  
  
    //Represent the node of binary tree  
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
            //Assign data to the new node, set left and right children to null  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
    }  
  
    //Represent the root of binary tree  
    public Node root;  
    public BinaryTree(){  
        root = null;  
    }  
  
    //findHeight() will determine the maximum height of the binary tree  
    public int findHeight(Node temp){  
        //Check whether tree is empty  
        if(root == null) {  
             System.out.println("Tree is empty");  
            return 0;  
        }  
        else {  
            int leftHeight = 0, rightHeight = 0;  
  
            //Calculate the height of left subtree  
            if(temp.left != null)  
                leftHeight = findHeight(temp.left);  
  
            //Calculate the height of right subtree  
            if(temp.right != null)  
                rightHeight = findHeight(temp.right);  
  
            //Compare height of left subtree and right subtree  
            //and store maximum of two in variable max  
            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;  
  
            //Calculate the total height of tree by adding height of root  
            return (max + 1);  
        }  
     }  
  
    public static void main(String[] args) {  
  
        BinaryTree bt = new BinaryTree();  
        //Add nodes to the binary tree  
        bt.root = new Node(1);  
        bt.root.left = new Node(2);  
        bt.root.right = new Node(3);  
        bt.root.left.left = new Node(4);  
        bt.root.right.left = new Node(5);  
        bt.root.right.right = new Node(6);  
        bt.root.right.right.right= new Node(7);  
        bt.root.right.right.right.right = new Node(8);  
  
        //Display the maximum height of the given binary tree  
        System.out.println("Maximum height of given binary tree: " + bt.findHeight(bt.root));  
  }  
}