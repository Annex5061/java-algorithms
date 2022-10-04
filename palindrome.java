import java.util.*;
public class Main
{
    public static void palindrome(int n)
    {
        int d,sum=0;
        int copy=n;
        while(n>0)
        {
            d=n%10;
            sum=sum*10+d;
            n/=10;
        }
        if(copy==sum)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a Palindrome Number");
    }
	public static void main(String args[]) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		palindrome(num);
	}
}
