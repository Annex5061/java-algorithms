public class Make_Change_Problem{
    static int max = 100;

    static int[] ans = new int[max];
    public static void main(String[] args){
        int coins[] = {25,20,10,5};
        int value = 105;
        
        int minCount = findMinCoins(coins,value);

        System.out.println("Total coins Needed = " + minCount);
        
    }

    public static int findMinCoins(int[] coins,int val){
        int count = 0;

        for(int i=0;i<coins.length;i++){
            while(val>=coins[i]){
                val -= coins[i];
                ans[count++] = coins[i]; 
            }
            if(val == 0)
                break;
        }

        return count;
    }
}