import java.util.*;
class PalinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting and ending point to find palindrome in between");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("palindrome numbers...");
        for(int i=m;i<=n;i++)
        {
            int x=i;
            int s=0;
            while(x!=0)
            {
                s=s*10+(x%10);
                x=x/10;
            }
            if(i==s)
            {
                System.out.println(i);
            }
        }
    }
}