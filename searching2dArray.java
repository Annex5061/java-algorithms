import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 34, 65, 87, 12, 32},
                {65, 347, 52, 6, 1, 35},
                {56, 1, 23, 10, 1, 2}
        };
        int[] ans=Searchin2d(arr,1);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Searchin2d(int[][] arr,int target)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

