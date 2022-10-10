#include <iostream>
using namespace std;
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
    return;
}
int partition(int arr[], int start, int end)
{
    int pivot = arr[end];
    int i = start - 1;
    for (int j = start; j < end; j++)
    {
        if (arr[j] <= pivot)
        {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    i++;
    swap(arr[i], arr[end]);
    return i;
}

void quickSort(int arr[], int start, int end)
{
    if (start < end)
    {
        int part = partition(arr, start, end);
        quickSort(arr, start, part - 1);
        quickSort(arr, part + 1, end);
    }
}

int main()
{
    int size;
    cout << "Enter size: ";
    cin >> size;
    int arr[size];
    cout << "Enter array: ";
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }

    quickSort(arr, 0, size - 1);

    cout << "Sorted array is: ";
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}