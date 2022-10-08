import java.util.*;
public class Pyramid
{
	public static void main(String args[]) 
	{
		int rows,i,k,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		rows=sc.nextInt();
		for(i=0;i<=rows;i++)
		{
			for(j=0;j<rows-i;j++)
				System.out.print(" ");
			for(k=0;k<2*i-1;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
