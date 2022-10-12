#include <stdio.h>
void bubblesort(int arr[], int n)
{

    for (int i = 0; i < n - 1; i++)
    {
        int isSwaped = 0;
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                isSwaped = 1;
            }
        }
        if (isSwaped = 0)
        {
            break;
        }
    }
}

int main()
{
    int arr[] = {90,60,50,20,30};
    int n = sizeof(arr) / sizeof(arr[0]);
    bubblesort(arr, n);
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}