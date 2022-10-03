
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end){
            int mid = (start + end)/2;
            if (x == arr[mid]){
                return mid;
            } else if (x < mid){
                end = mid - 1;
            } if (x > mid){
                end = mid + 1;
            }
          
            
        }
        return -1;
        
    }

}
