// Java program to merge K sorted
// arrays of size N each.

// A Min heap node
class MinHeapNode {
	int element; // The element to be stored

	// index of the array from
	// which the element is taken
	int i;

	// index of the next element
	// to be picked from array
	int j;

	public MinHeapNode(int element, int i, int j)
	{
		this.element = element;
		this.i = i;
		this.j = j;
	}
};

// A class for Min Heap
class MinHeap {
	MinHeapNode[] harr; // Array of elements in heap
	int heap_size; // Current number of elements in min heap

	// Constructor: Builds a heap from
	// a given array a[] of given size
	public MinHeap(MinHeapNode a[], int size)
	{
		heap_size = size;
		harr = a;
		int i = (heap_size - 1) / 2;
		while (i >= 0) {
			MinHeapify(i);
			i--;
		}
	}

	// A recursive method to heapify a subtree
	// with the root at given index This method
	// assumes that the subtrees are already heapified
	void MinHeapify(int i)
	{
		int l = left(i);
		int r = right(i);
		int smallest = i;

		if (l < heap_size
			&& harr[l].element < harr[i].element)
			smallest = l;

		if (r < heap_size
			&& harr[r].element < harr[smallest].element)
			smallest = r;

		if (smallest != i) {
			swap(harr, i, smallest);
			MinHeapify(smallest);
		}
	}

	// to get index of left child of node at index i
	int left(int i) { return (2 * i + 1); }

	// to get index of right child of node at index i
	int right(int i) { return (2 * i + 2); }

	// to get the root
	MinHeapNode getMin()
	{
		if (heap_size <= 0) {
			System.out.println("Heap underflow");
			return null;
		}
		return harr[0];
	}

	// to replace root with new node
	// "root" and heapify() new root
	void replaceMin(MinHeapNode root)
	{
		harr[0] = root;
		MinHeapify(0);
	}

	// A utility function to swap two min heap nodes
	void swap(MinHeapNode[] arr, int i, int j)
	{
		MinHeapNode temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// A utility function to print array elements
	static void printArray(int[] arr)
	{
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	// This function takes an array of
	// arrays as an argument and All
	// arrays are assumed to be sorted.
	// It merges them together and
	// prints the final sorted output.
	static void mergeKSortedArrays(int[][] arr, int K)
	{
		MinHeapNode[] hArr = new MinHeapNode[K];
		int resultSize = 0;
		for (int i = 0; i < arr.length; i++) {
			MinHeapNode node
				= new MinHeapNode(arr[i][0], i, 1);
			hArr[i] = node;
			resultSize += arr[i].length;
		}

		// Create a min heap with k heap nodes. Every heap
		// node has first element of an array
		MinHeap mh = new MinHeap(hArr, K);

		int[] result
			= new int[resultSize]; // To store output array

		// Now one by one get the minimum element from min
		// heap and replace it with next element of its
		// array
		for (int i = 0; i < resultSize; i++) {

			// Get the minimum element and store it in
			// result
			MinHeapNode root = mh.getMin();
			result[i] = root.element;

			// Find the next element that will replace
			// current root of heap. The next element
			// belongs to same array as the current root.
			if (root.j < arr[root.i].length)
				root.element = arr[root.i][root.j++];
			// If root was the last element of its array
			else
				root.element = Integer.MAX_VALUE;

			// Replace root with next element of array
			mh.replaceMin(root);
		}

		printArray(result);
	}

	// Driver's code
	public static void main(String args[])
	{
		int[][] arr = { { 2, 6, 12, 34 },
						{ 1, 9, 20, 1000 },
						{ 23, 34, 90, 2000 } };

		System.out.println("Merged array is :");

		// Function call
		mergeKSortedArrays(arr, arr.length);
	}
};

// This code is contributed by harsh
