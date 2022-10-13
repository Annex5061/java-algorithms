import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the range");
        n=sc.nextInt();
        for (i=1;i<=n;i++)                                
        {
            if (i%15==0)                                                
            System.out.println("FizzBuzz");
            else if (i%5==0)    
            System.out.println("Buzz");
            else if (i%3==0)    
            System.out.println("Fizz");
            else
            System.out.println(i);                   
        }
    }
}