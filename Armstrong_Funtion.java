import java.io.*;
class Armstrong_Funtion
{
    public int Number(int n)
    {
        int r,a=0,ano=n,flag=0;
        while(n>0)
        {
            r = n%10;
            a = a + (r*r*r);
            n = (n-r)/10;
        }
        if(ano==a)
        {
            flag = 1;
        }
        else
        {
            flag = 0;
        }
        return(flag);
    }
    public static void main(String args[]) throws IOException
    {
        System.out.println("Armstrong Number");
        System.out.println("****************");
        System.out.println("");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int d,p;
        System.out.print("Enter Number : ");
        d = Integer.parseInt(br.readLine());
        System.out.println("");
        Armstrong_Funtion ob = new Armstrong_Funtion();
        p = ob.Number(d);
        if(p==1)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is Not Armstrong");
        }
    }
}    
        
    
        