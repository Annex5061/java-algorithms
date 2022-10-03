// Java implementation of a O(n) time method for
// Zigzag order traversal
import java.util.*;
public class Main {
	// Class containing left and
	// right child of current
	// node and key value
	static class Node {

		public int data;
		public Node left, right;

		public Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}

	// A utility function to create a new node
	static Node newNode(int data)
	{
		Node node = new Node(data);
		return node;
	}

	// Function to print the zigzag traversal
	static ArrayList<Integer> zigZagTraversal(Node root)
	{

		ArrayList<Integer> ans = new ArrayList<Integer>();
		// if there is no element in the tree,return empty
		// arraylist
		if (root == null)
			return ans;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		// this variable helps to check if elements are to
		// be added from left to right or right to left
		boolean leftToRight = true;
		while (q.size() > 0) {
			int size = q.size();
			// this arraylist is used to store element at
			// current level
			ArrayList<Integer> temp = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
				temp.add(curr.data);
			}
			if (leftToRight) // at current level,add element
							// from left to right to our
							// answer
			{
				// do nothing
			}
			// we have to add element from to right to left
			// and this can be done by reversing our temp
			// arraylist
			else {
				Collections.reverse(temp);
			}
			// add element form temp arraylist to our ans
			// arraylist
			for (int i = 0; i < temp.size(); i++) {
				ans.add(temp.get(i));
			}
			// change the value of leftToRight from true to
			// false or false to true for next iteration.
			leftToRight = !(leftToRight);
		}
		// return our ans arraylist
		return ans;
	}

	public static void main(String[] args)
	{

		// Arraylist to store the traversal order.
		ArrayList<Integer> ans;

		// create tree
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(7);
		root.left.right = newNode(6);
		root.right.left = newNode(5);
		root.right.right = newNode(4);
		System.out.println(
			"ZigZag Order traversal of binary tree is");

		ans = zigZagTraversal(root);

		for (int i = 0; i < ans.size();
			i++) { // to print the order
			System.out.print(ans.get(i) + " ");
		}
	}
}
// this is contributed by harsh
