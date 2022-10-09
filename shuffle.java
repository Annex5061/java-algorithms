// Java program to demonstrate.  working of shuffle() method of Collections class

import java.util.*;

public class GFG {
	public static void main(String[] args)
	{
		ArrayList<String> mylist = new ArrayList<String>();

		// Adding custom input elements to list object
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");
		mylist.add("quiz");
		mylist.add("practice");
		mylist.add("qa");

		// list before shuffling
		System.out.println("Original List : \n" + mylist);

		// Shuffling the list
		Collections.shuffle(mylist);

		// list after shuffling
		System.out.println("\nShuffled List : \n" + mylist);
	}
}
