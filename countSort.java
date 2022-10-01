public class countSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,3,2,1}; //created array
        int k = 5;
        int n = arr.length;
        int[] countArr = new int[k+1];
        for(int i=1;i<=k;i++) countArr[i] = 0;

        for(int i=0;i<n;i++){
            countArr[arr[i]]++;
        }
        int i = 0,idx=0;
        while(i <= k){
            if(countArr[i] == 0) i++;
            else{
                arr[idx] = i;
                countArr[i]--;
                idx++;
            }
        }
        for(i=0;i<n;i++) System.out.print(arr[i] +" ");
    }
}
