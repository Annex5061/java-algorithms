public class fibonacci 
{ 
    public static void main(String[] args) 
    {
        int n1=0,n2=1,n3=0,i;
        System.out.print(n1 + " " +n2);
        for(i=2;i<=10;++i)
        {
            n3=n1+n2;
            System.out.print("\t" +n3);
            n1=n2;
            n2=n3;
        }
    }
}
