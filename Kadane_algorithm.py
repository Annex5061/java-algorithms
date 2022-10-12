'''
Problem - 
    Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(1)

Example -
    Input:
        N = 5
        arr[] = {1,2,3,-2,5}
    Output:
        9
'''


# Function to find sub array using kadane algorithm
def sub(arr):
    l = len(arr)
    i = 0
    sum = 0
    max_sum = 0

    while i < l:
        sum = sum + arr[i]
        if sum > max_sum:
            max_sum = sum
        if sum < 0:
            sum = 0
        i +=1
    return max_sum
    

# Main Code
n = int(input("Enter Size of Array : "))
arr = []*n
arr = list(map(int, input("Enter Array Elements : ").split()))

max_sum = sub(arr)

print("sum is : " + str(max_sum))
