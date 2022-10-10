import java.util.*;

public class AllFactors
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        boolean flag = false;
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                flag = true;
                System.out.print(i+" ");
            }
        }

        if(!flag)
        {
            System.out.print("This no. has no factors.");
        }
    }
}
