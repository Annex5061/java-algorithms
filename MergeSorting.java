import java.util.Arrays;

/* Time Complexity => 2(T/2) + N  == O(N logN) By Master's Theorem.
                        OR
   It is In Complete Binary Tree form  so Complexity of 
   Complete  Binary tree is => log(N) & it is Performing N step at every Mode
   so O(n*LogN ) */
public class MergeSorting {
    static int currStep=0;

    static void MergeSort(int []Array,int left,int right) {
    if(left < right){
            int mid = (left + right)/2;
            MergeSort(Array,left,mid);
            MergeSort(Array,mid+1,right);
            Merge(Array,left,mid,right);
        }
    }
    static void Merge(int []Array,int left,int mid,int right) {
        // Dummy Array for References
        int []b=new int[left+right];
        int i=left; 
        int j=mid+1;

        int k = left; // For Dummy Array

        // if element of First Partition Array is smaller than Dummy == Array,
        // if element of Second Partition Array is smaller than Dummy == Array.
        while(i<=mid&&j<=right){ 
            if(Array[i]<Array[j]){
                b[k]=Array[i++];
            }
            else{
                b[k]=Array[j++];
            }
            k++;
        }
        // if first Partition of Array Completed then copy remaining,
        // Second Partition to Dummy.
        if(i>mid){
            while(j<right){
                b[k++]=Array[j++];
            }
        }
        // if Second Partition of Array Completed then copy remaining,
        // Second Partition to Dummy.
        else{
            while(i<mid){
                b[k++]=Array[i++];
            }
        }
        // Copy Dummy Array into Original Array.
        for(k=left; k<right; k++){
            Array[k]=b[k];
        }
        System.out.println("Array at currStep = " + currStep++);
        Arrays.stream(Array).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int []Array={9,4,7,6,3,15};
        int len=Array.length;
        MergeSort(Array,0, len-1);

        System.out.println("Array After Sorting is ");
        for(Integer i:Array){
            System.out.println(i);
        }
    }
}
