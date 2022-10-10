public class CeilingNum {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int num = 5;
        int ans=Ceilingnum(arr,num);
        System.out.println(ans);
    }

    public static int Ceilingnum(int arr[],int target)
    {
        if(target>arr[arr.length-1])
        {
            return -1;
        }

        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return arr[mid];
            }
        }
        return arr[start]; // for floor value start will be replaced with end
    }

}

