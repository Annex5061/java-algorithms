import java.util.*;
class Gcd
{
     public static int gcd(int n1,int n2)
       {
         while(n1!=n2)
           {
             if(n1>n2)
              {
                n1=n1-n2;
              } 
             else
              {
                 n2=n2-n1;
              }
         }  
      return n1;   

      }  
    public static void main(String args[])
      {
        int n1,n2;
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter n1:");
        n1=Sc.nextInt();
        System.out.print("enter n2:");
        n2=Sc.nextInt();
        System.out.println("gcd of "+n1+" and "+n2+" is "+gcd(n1,n2));
       }
    
}


