
class CountingSort {
	void sort(char arr[])
	{
		int n = arr.length;

		char output[] = new char[n];

		int count[] = new int[256];
		for (int i = 0; i < 256; ++i)
			count[i] = 0;

		// store count of each character
		for (int i = 0; i < n; ++i)
			++count[arr[i]];

		
		for (int i = 1; i <= 255; ++i)
			count[i] += count[i - 1];

		// Build the output character array
		for (int i = 0; i < n; ++i) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}

		for (int i = 0; i < n; ++i)
			arr[i] = output[i];
	}

	// Driver method
	public static void main(String args[])
	{
		CountingSort ob = new CountingSort();
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
					'r', 'g', 'e', 'e', 'k', 's' };

		ob.sort(arr);

		System.out.print("Sorted character array is ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]);
	}
}

