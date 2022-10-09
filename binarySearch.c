#include <stdio.h>

int binarySearch(int arr[], int value, int left, int right)
{
    if (left > right)
    {
        return -1;
    }
    int mid = (left + right) / 2;

    if (arr[mid] == value)
    {
        return mid;
    }
    else if (arr[mid] < value)
    {
        return binarySearch(arr, value, mid + 1, right);
    }
    else
    {
        return binarySearch(arr, value, left, mid - 1);
    }
}

int main()
{
    int array[] = {1, 4, 6, 8, 9, 10, 15, 36, 45, 97};
    int n = 10;

    int idx = binarySearch(array, 36, 0, n - 1);

    printf("%d", idx);

    return 0;
}
