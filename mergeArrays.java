import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 7, 9, 10}; //m=7 length
        int[] arr2 = {2, 5, 8, 11};  //n=4 length
        merge(arr1, 7, arr2, 4);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int j = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i > m - 1)
            {
                nums[i] = nums2[j];
                j = +1;
            } else {
                nums[i] = nums1[i];
            }

        }
        System.out.println(Arrays.toString(nums));

            int temp;
            for(int k=0;k<nums.length;k++)
            {
                for(int z=1;z<nums.length-k;z++)
                {
                    if(nums[z]<nums[z-1]) {
                        temp = nums[z];
                        nums[z] = nums[z-1];
                        nums[z-1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
