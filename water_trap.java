public class water_trap {

    static int trap(int[]arr){
        int trapW=0;

        int n=arr.length;
        for (int i=0;i<n;i++){
            int j=i;
            int lm=0;
            int rm=0;
            while(j>=0){
                lm=Math.max(lm,arr[j]);
                j--;
            }
            j=i;
            while(j<n){
                rm=Math.max(rm,arr[j]);
                j++;
            }
            trapW+=Math.min(lm,rm)-arr[i];

        }



        return trapW;
    }


    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("total water trapped " + trap(arr));
    }

}
