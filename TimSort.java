import java.util.Arrays;
public final class TimSort {

	static int RUN = 32;
	public static void insertionSort(int[] arr, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp && j >= left) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {

		int leftArryLen = mid - left + 1, rightArrLen = right - mid;
		int[] leftArr = new int[leftArryLen];
		int[] rightArr = new int[rightArrLen];

		for (int x = 0; x < leftArryLen; x++) {
			leftArr[x] = arr[left + x];
		}

		for (int x = 0; x < rightArrLen; x++) {
			rightArr[x] = arr[mid + 1 + x];
		}

		int i = 0;
		int j = 0;
		int k = left;

		while (i < leftArryLen && j < rightArrLen) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < leftArryLen) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}

		while (j < rightArrLen) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}
	}

	public static void timSort(int[] arr) {
		int length = arr.length;

		// Sort individual subarrays of size THRESHOLD
		for (int i = 0; i < length; i += RUN) {
			// perform insertion sort
			insertionSort(arr, i, Math.min((i + 31), (length - 1)));
		}

		for (int size = RUN; size < length; size = 2 * size) {
			for (int left = 0; left < length; left += 2 * size) {
				int mid = left + size - 1;
				int right = Math.min((left + 2 * size - 1), (length - 1));
				// perform merge sort
				merge(arr, left, mid, right);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 3, 2, 19, 7, 15, 23, 13, 1 };
		System.out.println(Arrays.toString(arr));
		timSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
