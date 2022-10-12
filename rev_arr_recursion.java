public class rev_arr_recursion {

    static void printArr(int arr[],int n){
        System.out.println("new array is: \n");
        for (int i =0; i<n;i++){
            System.out.println(arr[i]+" ");
        }




    }


    static void revArr(int arr[],int start,int end ){
       if (start<end){int temp=0;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        revArr(arr,start+1,end-1);
    }}





    public static void main(String[] args){
        int n =5;
        int arr[]={1,2,3,4,5};
        int start=0;
        int end= n-1;
        revArr(arr,start,end);
        printArr(arr,n);
    }
}
