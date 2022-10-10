import java.util.*;
public class Main
{
    public static boolean duck(String num,int len)
    {
        int i=0;
        while (i<len&&num.charAt(i)=='0')
        i++;
        while(i<len)
        {
            if(num.charAt(i)=='0')
            return true;
            i++;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String num=sc.next();
        if(duck(num,num.length()))
        System.out.println("Duck Number");
        else
        System.out.println("Not a Duck Number");
    }
}