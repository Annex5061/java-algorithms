import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the diamond");
        int num=sc.nextInt();
        int j,k;
        for(j=1;j<=num;j++) 
        {
            for(k=1;k<=num-j;k++)
            System.out.print(" ");
            for(k=1;k<=j*2-1;k++) 
            System.out.print("*");
            System.out.println();
        }
        for(j=num-1;j>0;j--)
        {
            for(k=1;k<=num-j;k++)
            System.out.print(" ");
            for(k=1;k<=j*2-1;k++)
            System.out.print("*");
            System.out.println();
        }
    }
}