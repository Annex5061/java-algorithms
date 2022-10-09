#include <stdio.h>

void calculateRatio(float profit_arr[], float weight_arr[], float profit_weight_ratio[])
{

    for (int i = 0; i < 3; i++)
    {
        profit_weight_ratio[i] = (profit_arr[i] / weight_arr[i]);
    }
}

void selectionSort(float profit_arr[], float weight_arr[], float ratio_arr[], int n)
{

    for (int o = 0; o < n; o++)
    {
        int max = o;
        for (int i = o; i < n; i++)
        {

            if (ratio_arr[i] > ratio_arr[max])
            {
                max = i;
            }
        }

        float temp = ratio_arr[o];
        ratio_arr[o] = ratio_arr[max];
        ratio_arr[max] = temp;

        float temp2 = profit_arr[o];
        profit_arr[o] = profit_arr[max];
        profit_arr[max] = temp2;

        float temp3 = weight_arr[o];
        weight_arr[o] = weight_arr[max];
        weight_arr[max] = temp3;
    }
}

void printArray(float arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%.2f ", arr[i]);
    }
}

void fractionalKnapsack(float weight_array[], float profit[], float capacity, int n)
{
    float value = 0;

    for (int i = 0; i < n; i++)
    {

        if (weight_array[i] <= capacity)
        {
            value = value + profit[i];
            capacity = capacity - weight_array[i];
        }
        else if (capacity > 0 && weight_array[i] > capacity)
        {
            value = value + profit[i] * (capacity / weight_array[i]);
            capacity = capacity - capacity;
        }
    }

    printf("\n\nFinal value - %.2f", value);
}

void addToArray(float array[], int n)
{
    for (int i = 0; i < n; i++)
    {
        scanf("%2f", &array[i]);
    }
}

int main()
{

    printf("\nName - Shubhankar Nautiyal\nSap id - 1000014085\n\n");

    printf("\nEnter no. items avialable: ");
    int n;
    scanf("%d", &n);
    float profit_array[n];
    float weight_array[n];
    float profit_weight_ratio[n];
    float capacity;

    printf("Enter profit elements : ");
    addToArray(profit_array, n);

    printf("Enter weight elements : ");
    addToArray(weight_array, n);

    printf("Enter Knapsack capacity : ");
    scanf("%f", &capacity);

    calculateRatio(profit_array, weight_array, profit_weight_ratio);
    selectionSort(profit_array, weight_array, profit_weight_ratio, 3);

    fractionalKnapsack(weight_array, profit_array, capacity, 3);

    return 0;
}
