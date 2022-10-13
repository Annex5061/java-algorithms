class Node {    
    public int value;    
    public Node left, right;    
    
    public Node(int element)    
    {    
        value = element;    
        left = right = null;    
    }    
}    
    
class Tree {    
    Node root;  /* root of the tree */  
    
    Tree() { root = null; }    
  /*function to print the nodes of given binary in Preorder*/  
    void traversePreorder(Node node)    
    {    
        if (node == null)    
            return;    
        System.out.print(node.value + " ");    
        traversePreorder(node.left);    
        traversePreorder(node.right);    
    }    
  /*function to print the nodes of given binary in Inorder*/  
    void traverseInorder(Node node)    
    {    
        if (node == null)    
            return;    
        traverseInorder(node.left);    
        System.out.print(node.value + " ");    
        traverseInorder(node.right);    
    }    
    /*function to print the nodes of given binary in Postorder*/  
    void traversePostorder(Node node)    
    {    
        if (node == null)    
            return;    
        traversePostorder(node.left);    
        traversePostorder(node.right);    
        System.out.print(node.value + " ");    
    }    
    
  
    void traversePreorder() { traversePreorder(root); }    
    void traverseInorder() { traverseInorder(root); }    
    void traversePostorder() { traversePostorder(root); }    
    
    public static void main(String args[])    
    {    
        Tree pt = new Tree();    
        pt.root = new Node(36);    
        pt.root.left = new Node(26);    
        pt.root.right = new Node(46);    
        pt.root.left.left = new Node(21);    
        pt.root.left.right = new Node(31);    
        pt.root.left.left.left = new Node(11);    
        pt.root.left.left.right = new Node(24);    
        pt.root.right.left = new Node(41);    
        pt.root.right.right = new Node(56);    
        pt.root.right.right.left = new Node(51);    
        pt.root.right.right.right = new Node(66);    
    
        System.out.println();    
        System.out.println("The Preorder traversal of given binary tree is - ");    
        pt.traversePreorder();    
        System.out.println("\n");    
        System.out.println("The Inorder traversal of given binary tree is - ");    
        pt.traverseInorder();    
        System.out.println("\n");    
        System.out.println("The Postorder traversal of given binary tree is - ");    
        pt.traversePostorder();    
        System.out.println();    
    }    
}