import java.util.*;
public class Disarium{
    boolean isDisarium(int n){
        byte c=0;
        int b=0;
        for(int i=n;i>0;c+=1,i/=10);
        for(int i=n;i>0;b=b+(int)Math.pow(i%10,c--),i/=10);
        if(n==b)
            return true;
        return false;
    }
    
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        if(new Disarium().isDisarium(new Scanner(System.in).nextInt()))
            System.out.println("Disarium number");
        else
            System.out.println("Not an Disarium number.");
    }
}