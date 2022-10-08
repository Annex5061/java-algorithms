
//sum of n numbers



public class parameterized_recursion {

    static int f(int i, int sum){
           if(i<0){
               System.out.println(sum);
                return 0;

           }
      f(i-1,sum+i);
        return 0;

    }

    public static void main(String[] args){

    int n =5;
    int sum =0;
    f(n,sum);



    }
}
