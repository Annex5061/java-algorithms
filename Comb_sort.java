
class CombSort
{

	int getNextGap(int gap)
	{
		
		gap = (gap*10)/13;
		if (gap < 1)
			return 1;
		return gap;
	}

	void sort(int arr[])
	{
		int n = arr.length;

		int gap = n;


		boolean swapped = true;

		while (gap != 1 || swapped == true)
		{
			// Find next gap
			gap = getNextGap(gap);

			// Initialize swapped as false so that we can
			// check if swap happened or not
			swapped = false;

			// Compare all elements with current gap
			for (int i=0; i<n-gap; i++)
			{
				if (arr[i] > arr[i+gap])
				{
					// Swap arr[i] and arr[i+gap]
					int temp = arr[i];
					arr[i] = arr[i+gap];
					arr[i+gap] = temp;

					// Set swapped
					swapped = true;
				}
			}
		}
	}

	// Driver method
	public static void main(String args[])
	{
		CombSort ob = new CombSort();
		int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
		ob.sort(arr);

		System.out.println("sorted array");
		for (int i=0; i<arr.length; ++i)
			System.out.print(arr[i] + " ");

	}
}

