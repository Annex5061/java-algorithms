import java.util.*;

public class heap_sort {
    public static void main(String[] args) {

        // int a[]={78,22,54,25,65};
        // int n=a.length;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=n-i;
        }

      long start=System.nanoTime();
      
       heap_sort hp=new heap_sort();
        hp.sort(a);
       long end=System.nanoTime();
       long runningtime=(end-start);
        System.out.println("after sorting:" +"running time is"+runningtime +"ns");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(a[i]+ "");
        // }
        // System.out.println();

    }

 
void max_heapify(int a[],int n,int i)
    {
        int largest=i;
        int l=2 * i+ 1;
        int r=2 * i+ 2;
     
        if(l < n  && a[l] >  a[largest])

        {
            largest=l;
        }
        
        if(r < n && a[r] > a[largest])

        {
            largest=r;
        }
        if(largest!=i)
     {
             int temp=a[i];
            a[i]=a[largest];  
            a[largest]=temp;

            max_heapify(a, n, largest);

        }

       
        


    }
 public void sort(int a[])
    {
        int n=a.length;
        for(int i=n / 2 - 1;i>=0;i--)
        {
            max_heapify(a, n, i);
        }
        for(int i=n-1; i>0;i--)
        {
         int t=a[0];
         a[0]=a[i];
         a[i]=t;

        max_heapify(a, i, 0);
        }

    }
    
  
   
}
