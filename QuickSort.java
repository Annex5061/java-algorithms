public class QuickSort {
    public static void main(String[] args) {
        for(int n = 10;n<=50;n+=5){
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = i;
            int[] cnt = {0};
            long startT = System.nanoTime();
            quickSort(arr,0,n-1,cnt);
            long endT = System.nanoTime();
            System.out.println(cnt[0] + "," + (endT - startT));
        }
    }
    public static void quickSort(int[] arr,int s,int e,int[] cnt){
        if(s < e){
            int pi = partition(arr,s,e);
            cnt[0]++;
            quickSort(arr, s, pi-1,cnt);
            cnt[0]++;
            quickSort(arr, pi+1, e,cnt);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int s,int e){
        int pivot = arr[e];
        int i = s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,e);
        return i+1;
    }
}
